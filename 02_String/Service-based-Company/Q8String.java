// Count Characters

import java.util.*;

public class Q8String {
    public static void main(String[] args) {

        String str = "hello world";
        Map<Character, Integer> freq = new HashMap<>();

        for (char c : str.toCharArray()) {
            if (c != ' ') {
                freq.put(c, freq.getOrDefault(c, 0) + 1);

            }
        }
        System.out.println("Charcter frequency");
        for (Map.Entry<Character, Integer> entry : freq.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());

        }
    }
}
