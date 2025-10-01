import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    static void backtrack(int[] arr, boolean[] visited, 
        ArrayList<Integer> curr, ArrayList<ArrayList<Integer>> result) {

        // If current permutation is complete, add it to the result
        if (curr.size() == arr.length) {
            result.add(new ArrayList<>(curr));
            return;
        }

        // Iterate through the array to build permutations
        for (int i = 0; i < arr.length; i++) {

            // Skip already visited elements or duplicates
            if (visited[i] || (i > 0 && arr[i] == arr[i - 1] && !visited[i - 1]))
                    continue;

            // Choose arr[i] for the current permutation
            visited[i] = true;
            curr.add(arr[i]);

            // Recursively build the next part of the permutation
            backtrack(arr, visited, curr, result);

            // Backtrack
            curr.remove(curr.size() - 1);
            visited[i] = false;
        }
    }

    // Function to return all unique permutations
    static ArrayList<ArrayList<Integer>> uniquePerms(int[] arr) {

        // Sort the array to handle duplicates
        Arrays.sort(arr);
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        ArrayList<Integer> curr = new ArrayList<>();
        boolean[] visited = new boolean[arr.length];

        // Start the backtracking process
        backtrack(arr, visited, curr, result);
        
        return result;
    }
};