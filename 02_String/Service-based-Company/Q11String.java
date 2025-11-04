import java.util.*;

public class Q11String {
    public static void main(String[] args) {
        String s = "25525511135";
        System.out.println(restoreIpAddresses(s));
    }

    public static List<String> restoreIpAddresses(String s) {
        List<String> result = new ArrayList<>();
        backtrack(s, 0, new ArrayList<>(), result);
        return result;
    }

    private static void backtrack(String s, int index, List<String> current, List<String> result) {
        if (current.size() == 4) {
            if (index == s.length()) {
                result.add(String.join(".", current));
            }
            return;
        }

        for (int len = 1; len <= 3 && index + len <= s.length(); len++) {
            String part = s.substring(index, index + len);
            if (isValid(part)) {
                current.add(part);
                backtrack(s, index + len, current, result);
                current.remove(current.size() - 1); // backtrack
            }
        }
    }

    private static boolean isValid(String part) {
        if (part.length() > 1 && part.startsWith("0"))
            return false;
        int num = Integer.parseInt(part);
        return num >= 0 && num <= 255;
    }
}
