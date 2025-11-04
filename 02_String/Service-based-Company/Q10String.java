
// string Rotation Check

// Check both strings are same length.

// Concatenate first string with itself.

// If s2 is a substring of that → it’s a rotation.
import java.util.*;

public class Q10String {
    public static boolean isRotation(String s1, String s2) {
        if (s1.length() != s2.length())
            return false;

        List<Character> list1 = new ArrayList<>();
        for (char c : s1.toCharArray())
            list1.add(c);

        for (int i = 0; i < s1.length(); i++) {
            Collections.rotate(list1, 1); // rotates list by 1 step
            StringBuilder sb = new StringBuilder();
            for (char c : list1)
                sb.append(c);
            if (sb.toString().equals(s2))
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isRotation("abcd", "cdab")); // true
    }
}
