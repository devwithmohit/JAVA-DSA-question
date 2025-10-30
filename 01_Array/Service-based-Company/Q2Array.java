
// Find Max & Min in Array
import java.util.*;

public class Q2Array {
    public static void main(String[] args) {

        Integer[] arr1 = { 12, 45, 2, 67, 34, 89, 5 };

        List<Integer> list1 = Arrays.asList(arr1);

        int min = Collections.min(list1);
        int max = Collections.max(list1);

        System.out.println("The minimum: " + min + " and Maximum: " + max);

    }
}

// You could loop manually and compare each element in normal ways.

// But Collections Framework already gives methods:
// Collections.min(list) and Collections.max(list)
