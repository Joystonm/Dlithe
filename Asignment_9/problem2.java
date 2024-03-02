package Asignment_9;
import java.util.ArrayList;
import java.util.Arrays;

public class problem2 {
    public static ArrayList<String> find_permutation(String S) {
        ArrayList<String> result = new ArrayList<>();
        char[] chars = S.toCharArray();
        Arrays.sort(chars); // Sort the characters to ensure lexicographical order
        boolean[] used = new boolean[S.length()];
        backtrack(chars, used, new StringBuilder(), result);
        return result;
    }
    
    private static void backtrack(char[] chars, boolean[] used, StringBuilder current, ArrayList<String> result) {
        if (current.length() == chars.length) {
            result.add(current.toString());
            return;
        }
        
        for (int i = 0; i < chars.length; i++) {
            if (used[i] || (i > 0 && chars[i] == chars[i - 1] && !used[i - 1])) {
                continue; // Skip if the character is already used or if it's a duplicate
            }
            used[i] = true;
            current.append(chars[i]);
            backtrack(chars, used, current, result);
            current.deleteCharAt(current.length() - 1);
            used[i] = false;
        }
    }

    public static void main(String[] args) {
        String S1 = "ABC";
        
        ArrayList<String> result1 = find_permutation(S1);
        
        System.out.println(result1);
    }
}
