
import java.util.Stack;

public class RemoveDuplicatesStack {

    public String RemoveDup(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (!stack.isEmpty() && stack.peek() == c) {
                stack.pop();
            } else {
                stack.push(c);
            }
        }

        StringBuilder result = new StringBuilder();

        for (char c : stack) {
            result.append(c);
        }

        return result.toString();
    }
}
