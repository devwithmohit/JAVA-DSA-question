
// Rotate Array by K times
import java.util.*;

public class Q4Array {
    public static void main(String[] args) {
        Integer[] arr1 = { 1, 2, 3, 4, 5, 6, 7 };

        List<Integer> list = Arrays.asList(arr1);

        // Rotate right by k steps
        int k = 1;
        Collections.rotate(list, k);

        // Step 4: Print rotated array
        System.out.println("Array after rotating " + k + " times: " + list);

    }
}

// Positive k → right rotation
// Negative k → left rotation
// Rotation means shifting elements —
// Right rotation → last elements move to front.
// Left rotation → front elements move to end.
// Instead of manually shifting one by one, you can:
// Convert array to a List.
// Use Collections.rotate(), which handles this rotation efficiently.
// It rotates elements to the right by default.
