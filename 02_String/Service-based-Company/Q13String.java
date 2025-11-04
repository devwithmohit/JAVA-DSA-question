// Count Words

import java.util.*;

public class Q13String {
    public static void main(String[] args) {
        String sentence = "this is a test this is only a test";
        String[] words = sentence.split(" ");
        System.out.println(words);
        Map<String, Integer> freq = new HashMap<>();

        for (String word : words) {
            freq.put(word, freq.getOrDefault(word, 0) + 1);
        }
        System.out.println("word frequency");
        for (Map.Entry<String, Integer> entry : freq.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
