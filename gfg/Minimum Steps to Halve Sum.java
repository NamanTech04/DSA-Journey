import java.util.Collections;
import java.util.PriorityQueue;

class Solution {
    public int minOperations(int[] arr) {
        // code here
        int n = arr.length;
        double sum = 0;
        double half = 0;
        int count = 0;
        PriorityQueue<Double> maxheap = new PriorityQueue<>(Collections.reverseOrder());
        
        for(int i = 0; i < n; i++) {
            sum += arr[i];
            maxheap.offer((double)arr[i]);
        }
        
        half = sum/2.0;
        
        while(sum > half) {
            double num = maxheap.poll();
            double halve = num/2.0;
            sum -= halve;
            count++;
            maxheap.offer(halve);
        }
        return count;
    }
}