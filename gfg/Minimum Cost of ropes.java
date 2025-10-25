
import java.util.PriorityQueue;

class Solution {
    public static int minCost(int[] arr) {
        // code here
        int n = arr.length;
        int sum = 0;
        int ans = 0;
        PriorityQueue<Integer> minheap = new PriorityQueue<>();
        
        for(int i = 0; i<n; i++) {
            minheap.offer(arr[i]);
        }
        
        while(minheap.size() >= 2) {
            int smallest = minheap.poll();
            int smallest2 = minheap.poll();
            
            sum = smallest + smallest2;
            ans += sum;
            minheap.offer(sum);
            
        }
        return ans;
    }
}