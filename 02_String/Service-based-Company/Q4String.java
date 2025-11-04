
// Print All Subsequences / Permutations
import java.util.*;

public class Q4String {
    public static void main(String[] args) {
        String str = "abc";
        List<String> result = new ArrayList<>();
        generateSubsequences(str, "", result);
        System.out.println("All Subsequences: " + result);
    }

    static void generateSubsequences(String str, String curr, List<String> result) {
        if (str.isEmpty()) {
            result.add(curr);
            return;
        }

        // Include current char
        generateSubsequences(str.substring(1), curr + str.charAt(0), result);

        // Exclude current char
        generateSubsequences(str.substring(1), curr, result);
    }
}
// Use recursion with swapping or substring insertion.

// Each character → 2 decisions → total 2ⁿ subsequences.

// You track current formed string (curr) and remaining (str).

// Store results in List<String> (a part of Collections).

// for permuation order does not matter
// public class Q4String {
// public static void main(String[] args) {
// String str = "abc";
// Set<String> result = new LinkedHashSet<>();
// generatePermutations("", str, result);
// System.out.println("All Permutations: " + result);
// }

// static void generatePermutations(String prefix, String remaining, Set<String>
// result) {
// if (remaining.isEmpty()) {
// result.add(prefix);
// return;
// }

// for (int i = 0; i < remaining.length(); i++) {
// char c = remaining.charAt(i);
// String rest = remaining.substring(0, i) + remaining.substring(i + 1);
// generatePermutations(prefix + c, rest, result);
// }
// }
// }
// Fix one character at a time → permute the rest.

// Set used to avoid duplicates, preserves insertion order (LinkedHashSet).
