
// Find Union & Intersection of Arrays
import java.util.*;

public class Q8Array {
    public static void main(String[] args) {
        Integer[] arr1 = { 1, 2, 3, 4, 5, 6 };
        Integer[] arr2 = { 4, 5, 6, 7, 8 };

        // convert both into sets
        Set<Integer> set1 = new HashSet<>(Arrays.asList(arr1));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(arr2));

        Set<Integer> union = new HashSet<>(set1);
        union.addAll(set2);

        Set<Integer> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);

        // Step 4: Print results
        System.out.println("Union: " + union);
        System.out.println("Intersection: " + intersection);
    }
}
// Whenever you hear union/intersection, instantly map it to Set operations.

// Union → combine sets (addAll)

// Intersection → keep only common ones (retainAll)
