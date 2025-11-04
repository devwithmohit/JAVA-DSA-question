// Reverse a String

import java.util.*;

public class Q1String {

    public static void main(String[] args) {

        String str = "helloworld";

        List<Character> list = new ArrayList<>();
        for (char c : str.toCharArray()) {
            list.add(c);
        }
        Collections.reverse(list);

        StringBuilder reversed = new StringBuilder();
        for (char c : list) {
            reversed.append(c);
        }
        System.out.println("Original String: " + str);
        System.out.println("Reversed String: " + reversed);
    }
}
// Think conversion: String → List → Reverse → String again.

// Strings can’t mutate; StringBuilder or a List handles transformation.

// Collections.reverse()
