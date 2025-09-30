import java.util.Arrays;

class Solution {
    public int largestPerimeter(int[] nums) {
        Arrays.sort(nums);  // Step 1: Sort
        for (int i = nums.length - 1; i >= 2; i--) {  // Step 2: Start from largest
            int a = nums[i - 2];
            int b = nums[i - 1];
            int c = nums[i];
            if (a + b > c) {  // Valid triangle
                return a + b + c;
            }
        }
        return 0;  // Step 3: No triangle found
    }
}