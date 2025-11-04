import java.util.*;

// Find Duplicate Characters in a String
public class Q3String {
    public static void main(String[] args) {
        String str = "programming";

        // Step 1: Create frequency map
        Map<Character, Integer> freq = new HashMap<>();

        // Step 2: Count occurrences
        for (char c : str.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }

        // Step 3: Print characters with count > 1
        System.out.println("Duplicate characters:");
        for (Map.Entry<Character, Integer> entry : freq.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " -> " + entry.getValue() + " times");
            }
        }
    }
}
// “Find duplicates” = count frequencies → instantly think Map.
