int winner = arr[0];
    int winCount = 0;

    for (int i = 1; i < arr.length; i++) {
        if (arr[i] > winner) {
            winner = arr[i];
            winCount = 1;
        } else {
            winCount++;
        }

        if (winCount == k) {
            return winner;
        }
    }

    return winner;
