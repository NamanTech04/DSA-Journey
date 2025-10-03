class Solution {
    static void possibleWordsRec(int[] arr, int index, StringBuilder prefix,
                                 String[] padMap, ArrayList<String> res) {
        if (index == arr.length) {
            res.add(prefix.toString());
            return;
        }
        int digit = arr[index];

        // Skip invalid digits
        if (digit < 2 || digit > 9) {
            possibleWordsRec(arr, index + 1, prefix, padMap, res);
            return;
        }

        // Place all possible letters for this digit
        for (char ch : padMap[digit].toCharArray()) {
            prefix.append(ch);
            possibleWordsRec(arr, index + 1, prefix, padMap, res);

            // Backtracking to previous state
            prefix.deleteCharAt(prefix.length() - 1);
        }
    }

    // Function to find all possible letter combinations
    static ArrayList<String> possibleWords(int[] arr) {
        ArrayList<String> res = new ArrayList<>();

        // mapping numbers with letters
        String[] padMap = {"", "", "abc", "def", "ghi", "jkl",
                           "mno", "pqrs", "tuv", "wxyz"};
        StringBuilder prefix = new StringBuilder();

        possibleWordsRec(arr, 0, prefix, padMap, res);
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {7, 8};
        ArrayList<String> words = possibleWords(arr);
        for (String word : words) {
            System.out.print(word + " ");
        }
    }
}