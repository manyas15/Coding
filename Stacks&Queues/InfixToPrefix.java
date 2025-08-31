
import java.util.Scanner;
import java.util.Stack;

public class InfixToPrefix {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter infix expression: ");
        String infix = sc.nextLine().replaceAll("\\s+", ""); // Remove any whitespace

        String prefix = infixToPrefix(infix);
        System.out.println("Prefix: " + prefix);
    }

    static int precedence(char ch) {
        return switch (ch) {
            case '+', '-' -> 1;
            case '*', '/' -> 2;
            case '^' -> 3;
            default -> -1;
        };
    }

    static boolean isOperator(char ch) {
        return ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '^';
    }

    static String reverseBrackets(String expr) {
        StringBuilder rev = new StringBuilder();
        for (int i = expr.length() - 1; i >= 0; i--) { // Reversing string and swapping parentheses
            char ch = expr.charAt(i);
            switch (ch) {
                case '(' -> rev.append(')');
                case ')' -> rev.append('(');
                default -> rev.append(ch);
            }
        }
        return rev.toString();
    }

    static String infixToPostfix(String expr) {
        StringBuilder ans = new StringBuilder();
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < expr.length(); i++) {
            char ch = expr.charAt(i);

            if (Character.isLetterOrDigit(ch)) {
                ans.append(ch);
            } else if (ch == '(') {
                stack.push(ch);
            } else if (ch == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    ans.append(stack.pop());
                }
                if (!stack.isEmpty())
                    stack.pop(); // pop '('
            } else if (isOperator(ch)) {
                while (!stack.isEmpty() && precedence(ch) <= precedence(stack.peek()) && stack.peek() != '(') {
                    ans.append(stack.pop());
                }
                stack.push(ch);
            }
        }

        while (!stack.isEmpty()) {
        ans.append(stack.pop());
        }

        return ans.toString();
    }

    static String infixToPrefix(String expr) {
        // Step 1: Reverse and swap brackets
        String reversed = reverseBrackets(expr);

        // Step 2: Convert to postfix from the reversed expression
        String postfix = infixToPostfix(reversed);

        // Step 3: Reverse the postfix result to get the final prefix expression
        return new StringBuilder(postfix).reverse().toString();
    }
}