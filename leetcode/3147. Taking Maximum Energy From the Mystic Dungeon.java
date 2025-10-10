class Solution {
    public int maximumEnergy(int[] energy, int k) {
        int max = Integer.MIN_VALUE;
        int n = energy.length;

        for(int i = n-k-1; i>=0; i--){
            energy[i] += energy[i + k];
        }

        for(int j = 0; j < n; j++) {
            max = Math.max(energy[j], max);
        }
        return max;
    }
}