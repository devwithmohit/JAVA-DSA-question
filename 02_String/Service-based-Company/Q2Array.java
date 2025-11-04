
// Check Palindrome
import java.util.*;

public class Q2Array {
    public static void main(String[] args) {
        String str = "madam";

        List<Character> list = new ArrayList<>();
        for (char c : str.toCharArray()) {
            list.add(c);
        }

        List<Character> reversed = new ArrayList<>(list);
        Collections.reverse(reversed);

        boolean isPalidrome = list.equals(reversed);
        if (isPalidrome) {
            System.out.println(str + " is a Palindrome");
        } else
            System.out.println(str + " is NOT a Palindrome");

    }
}
// Think: original vs reversed — if equal, it’s palindrome.

// Collections.reverse() saves you from manual index swapping.
