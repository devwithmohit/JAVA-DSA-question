
// Find Majority Element
import java.util.*;

public class Q5Array {

    public static void main(String[] args) {
        Integer[] arr = { 2, 2, 1, 1, 2, 2, 3, 2 };
        List<Integer> list = Arrays.asList(arr);

        Map<Integer, Integer> freq = new HashMap<>();
        for (int num : list) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        int n = list.size();
        Integer majority = null;
        for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
            if (entry.getValue() > n / 2) {
                majority = entry.getKey();
                break;

            }
        }
        if (majority != null) {
            System.out.println("Majority Element: " + majority);
        } else
            System.out.println("No Majority Element Found");
    }
}
// A majority element is the one that appears more than n/2 times (where n =
// size of array).
// majority problem equal to frequrncy counting problem
// That means use Map → element as key, count as value.
