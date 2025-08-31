
import java.util.Stack;

public class PreEval {

    public static void main(String[] args) {
        String prefix = "-9/*+5346";
        int result = PreVal(prefix);
        System.out.println("Prefix Evaluation Result: " + result);
    }

    public static int PreVal(String s) {
        Stack<Integer> stack = new Stack<>();

        for (int i = s.length() - 1; i >= 0; i--) {
            char ch = s.charAt(i); 

            if (Character.isDigit(ch)) {
                int chrr = ch - '0';
                stack.push(chrr);
            } else if (isOperator(ch)) {
                int a = stack.pop();
                int b = stack.pop();

                int result = applyOp(a, b, ch);

                stack.push(result);
            }
        }
        return stack.pop();
    }

    private static boolean isOperator(char ch) {
        return ch == '+' || ch == '-' || ch == '*' || ch == '/';
    }

    private static int applyOp(int a, int b, char op) {
        return switch (op) {
            case '+' ->
                a + b;
            case '-' ->
                a - b;
            case '*' ->
                a * b;
            case '/' ->
                a / b;
            default ->
                0;
        };
    }
}
