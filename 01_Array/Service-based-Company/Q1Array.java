import java.util.*;

// Reverse the Array

public class Q1Array {

    public static void main(String[] args) {

        Integer[] arr1 = { 2, 4, 6, 8, 10 };

        List<Integer> list1 = Arrays.asList(arr1);

        System.out.println(list1);

        Collections.reverse(list1);

        System.out.println(list1);

    }
}
