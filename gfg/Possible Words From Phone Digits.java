import java.util.*;

class Solution {
    private static final String[] KEYPAD = {
        "",    // 0
        "",    // 1
        "abc", // 2
        "def", // 3
        "ghi", // 4
        "jkl", // 5
        "mno", // 6
        "pqrs",// 7
        "tuv", // 8
        "wxyz" // 9
    };

    public ArrayList<String> possibleWords(int[] arr) {
        ArrayList<String> result = new ArrayList<>();
        if (arr == null || arr.length == 0) return result;
        backtrack(arr, 0, new StringBuilder(), result);
        return result;
    }

    private void backtrack(int[] arr, int index, StringBuilder sb, ArrayList<String> result) {
        if (index == arr.length) {
            result.add(sb.toString());
            return;
        }

        String letters = KEYPAD[arr[index]];
        for (char c : letters.toCharArray()) {
            sb.append(c);
            backtrack(arr, index + 1, sb, result);
            sb.deleteCharAt(sb.length() - 1);
        }
    }
}
