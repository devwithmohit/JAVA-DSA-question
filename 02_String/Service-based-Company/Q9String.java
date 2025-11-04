
// Replace / Remove Duplicates
import java.util.*;

public class Q9String {
    public static void main(String[] args) {
        String str = "programming";

        Set<Character> seen = new HashSet<>();
        StringBuilder sb = new StringBuilder();

        for (char c : str.toCharArray()) {
            if (!seen.contains(c)) {
                seen.add(c);
                sb.append(c);
            }
        }

        System.out.println("Original: " + str);
        System.out.println("Without duplicates: " + sb.toString());
    }
}

// public class RemoveDuplicatesUsingSet {
// public static void main(String[] args) {
// String str = "programming";
// Set<Character> set = new LinkedHashSet<>();
// for (char c : str.toCharArray()) {
// set.add(c);
// }
// StringBuilder sb = new StringBuilder();
// for (char c : set) {
// sb.append(c);
// }
// System.out.println(sb.toString()); // progamin
// }
// }

// “Duplicate” → hash-based lookup (Set/Map).

// “Remove” → skip re-adding or rebuild output without them.

// “Preserve order” → LinkedHashSet.

// “Ignore order” → HashSet.
