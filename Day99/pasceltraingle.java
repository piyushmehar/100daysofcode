class Solution {
    public List<Integer> getRow(int n) {
       List<Integer> row = new ArrayList<>();

    if (n < 0) {
        return row;
    }

    row.add(1);

    for (int i = 1; i <= n; i++) {
        List<Integer> newRow = new ArrayList<>();
        newRow.add(1);

        for (int j = 1; j < row.size(); j++) {
            newRow.add(row.get(j - 1) + row.get(j));
        }

        newRow.add(1);
        row = newRow;
    }

    return row;
}
}
