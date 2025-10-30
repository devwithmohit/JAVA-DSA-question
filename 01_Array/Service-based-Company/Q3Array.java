
// Remove Duplicates from Sorted Array
import java.util.*;

public class Q3Array {
    public static void main(String[] args) {

        // Step 1: Sorted Array
        Integer[] arr = { 1, 1, 2, 2, 3, 3, 4, 5, 5 };
        // Convert array to LinkedHashSet (removes duplicates + maintains order)
        Set<Integer> set1 = new LinkedHashSet<>(Arrays.asList(arr));

        List<Integer> uniqueList = new ArrayList<Integer>(set1);

        System.out.println("After removing duplicates: " + uniqueList);
    }
}

// Whenever you see "remove duplicates", think of Set — it doesn’t allow
// repeated elements.

// Since array is sorted, you can use LinkedHashSet to preserve that order.
