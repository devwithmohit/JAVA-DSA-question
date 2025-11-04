// Find First Repeated Word

import java.util.*;

public class Q7String {
    public static void main(String[] args) {
        String sentence = "this is a test this is only a test";
        String[] words = sentence.split(" ");

        Set<String> seen = new HashSet<>();
        String repeated = null;
        for (String word : words) {
            if (seen.contains(word)) {
                repeated = word;
                break;
            } else {
                seen.add(word);
            }
        }
        if (repeated != null)
            System.out.println("First repeated word: " + repeated);
        else
            System.out.println("No repeated words found.");
    }
}
// “Repeated” → frequency tracking → think Set or Map.

// “First repeated” → order matters → single pass with early break.
