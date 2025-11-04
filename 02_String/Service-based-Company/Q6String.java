
// check balaced paraanthesis
import java.util.*;

public class Q6String {
    public static boolean isBalanced(String s) {
        Stack<Character> stack = new Stack<>();
        Map<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put('}', '{');
        map.put(']', '[');

        for (char ch : s.toCharArray()) {
            if (map.containsValue(ch)) { // opening bracket
                stack.push(ch);
            } else if (map.containsKey(ch)) { // closing bracket
                if (stack.isEmpty() || stack.pop() != map.get(ch)) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String exp1 = "{[()]}";
        String exp2 = "{[(])}";
        System.out.println(exp1 + " → " + isBalanced(exp1));
        System.out.println(exp2 + " → " + isBalanced(exp2));
    }
}
