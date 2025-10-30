
// Find Pair with Given Sum
import java.util.*;

public class Q6Array {
    public static void main(String[] args) {
        Integer[] arr1 = { 8, 7, 2, 5, 3, 1 };
        int target = 10;

        List<Integer> list = Arrays.asList(arr1);

        // Use a HashSet to store visited elements

        Set<Integer> seenElements = new HashSet<>();

        boolean found = false;

        for (int num : list) {
            int complement = target - num;

            if (seenElements.contains(complement)) {
                System.out.println("Pair found: (" + num + ", " + complement + ")");
                found = true;

            }

            seenElements.add(num);
        }
        if (!found)
            System.out.println("No pair found with sum " + target);

    }
}

// When you see “pair with sum”, your brain should jump to “complement pattern”.
// (Find if target - current already seen.)
