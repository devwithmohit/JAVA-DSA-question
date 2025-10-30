
// Move Negative Elements to One Side
import java.util.*;

public class Q9Array {
    public static void main(String[] args) {
        Integer[] arr = { 1, -2, 3, -4, -5, 6, -7, 8, 9 };
        List<Integer> list = new ArrayList<>(Arrays.asList(arr));

        Collections.sort(list, (a, b) -> {
            if (a < 0 && b >= 0)
                return -1;
            else if (a >= 0 && b < 0)
                return 1;
            else
                return 0;
        });
        System.out.println("After moving nagtaives: " + list);
    }
}
// Move all negatives one side” → think of partitioning.

// Collections way → use sort with custom comparator instead of manual swaps.
