import java.util.Arrays;

class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        int n = spells.length;
        int m = potions.length;
        Arrays.sort(potions);
        int[] ans = new int[n];

        for (int i = 0; i < n; i++) {
            int low = 0;
            int high = m-1;

            while(low<=high){
                int mid = low+(high-low)/2;
                long check = (long)potions[mid] * (long)spells[i];
                if(check >= success) high = mid-1;
                else low = mid+1;
            }
            ans[i] = m-low;
        }
        return ans;
    }
}