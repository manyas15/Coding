import java.util.Scanner;
import java.util.Stack;

public class InfixToPostfix {

    static int preference(char ch) {
        switch (ch) {
            case '+', '-' -> {
                return 1;
            }
            case '*', '/' -> {
                return 2;
            }

            case '^' -> {
                return 3;
            }
        }
        // switch (ch) {
        // case '+':
        // case '-':
        // return 1;

        // case '*':
        // case '/':
        // return 2;

        // case '^':
        // return 3;
        // }
        return -1;
    }

    public static String InToPro(String s) {

        Stack<Character> stack = new Stack<>();
        StringBuilder ans = new StringBuilder();

        int n = s.length();

        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if (ch >= 'A' && ch <= 'Z' || ch >= 'a' && ch <= 'z' || Character.isDigit(ch)) {
                ans.append(ch);
            }

            else if (ch == '(') {
                stack.push(ch);
            }

            else if (ch == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    ans.append(stack.pop());
                }
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            }

            else {
                while (!stack.isEmpty() && preference(ch) <= preference(stack.peek())) {
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

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter infix expression: ");
        String str = scanner.nextLine();

        String postFix = InToPro(str);
        System.out.println("Postfix: " + postFix);
    }
}