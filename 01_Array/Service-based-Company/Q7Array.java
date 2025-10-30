
// Check Array is Subset of Another
import java.util.*;

public class Q7Array {

    public static void main(String[] args) {
        Integer[] arr1 = { 1, 3, 5, 7 };
        Integer[] arr2 = { 1, 2, 3, 4, 5, 6, 7, 8 };

        // convert both array to sets
        Set<Integer> set1 = new HashSet<>(Arrays.asList(arr1));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(arr2));

        boolean isSubset = set2.containsAll((set1));
        if (isSubset)
            System.out.println("Array1 is a subset of Array2");
        else
            System.out.println("Array1 is NOT a subset of Array2");
    }
}

// When you see “subset”, think Set containment.

// containsAll() neatly checks if all elements of one collection are present in
// another.
