public int maxWaterContainer(int[] heights) {
int leftPtr = 0;
    int rightPtr = heights.length - 1;
    int maxWater = 0;

    while (leftPtr < rightPtr) {
        int minBarHeight = Math.min(heights[leftPtr], heights[rightPtr]);
        int currentWater = (rightPtr - leftPtr) * minBarHeight;
        maxWater = Math.max(maxWater, currentWater);

        if (heights[leftPtr] < heights[rightPtr]) {
            leftPtr++;
        } else {
            rightPtr--;
        }
    }

    return maxWater;
}
