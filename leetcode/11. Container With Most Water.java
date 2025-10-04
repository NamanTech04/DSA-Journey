class Solution {
    public int maxArea(int[] height) {
        int maxArea = Integer.MIN_VALUE;
        int i = 0;
        int j = height.length - 1;
        while(i<j) {
            int width = j - i;
            int currentArea = Math.min(height[i], height[j]) * width;
            maxArea = Math.max(maxArea, currentArea);
            if(height[i] <= height[j]) {
                i++;
            } else{
                j--;
            }
        }
        return maxArea;
    }
}