
// this is the Dutch National Flag problem
// Sort Array of 0s, 1s, and 2s
import java.util.*;

public class Q10Array {

    public static void main(String[] args) {
        Integer[] arr = { 0, 2, 1, 2, 0, 1, 1, 0 };

        // Step 1: Convert array to List
        List<Integer> list = Arrays.asList(arr);

        // Step 2: Sort using Collections
        Collections.sort(list);

        // Step 3: Print sorted array
        System.out.println("Sorted Array (0s, 1s, 2s): " + list);
    }
}

// Collections.sort() internally uses Timsort (hybrid of merge + insertion
// sort).
