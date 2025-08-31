import java.util.Scanner;

public class SwitchOp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter num1: ");
        int num1 = input.nextInt();

        System.out.println("Enter num2: ");
        int num2 = input.nextInt();

        System.out.println("Enter operator (+, -, *, /, %): ");
        String op = input.next();

        int result = 0;
        switch (op) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                    return;
                }
                break;
            case "%":
                if (num2 != 0) {
                    result = num1 % num2;
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                    return;
                }
                break;
            default:
                System.out.println("Invalid operator. Please use +, -, *, /, or %.");
                return;
        }

        // Display the result
        System.out.println("Result: " + result);
    }
}