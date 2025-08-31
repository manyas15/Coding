
import java.util.InputMismatchException;
import java.util.Scanner;

public class DivisionExample {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("First no");
            int a = sc.nextInt();

            System.out.println("Second no");
            int b = sc.nextInt();

            int result = a / b;
            System.out.println("Result: " + result);
        }
        catch (ArithmeticException e) {
            System.out.println("divided by 0");
        }
        catch (InputMismatchException a) {
            System.out.println("Please enter only integer numbers");
        }
        finally {
            System.out.println("Program executed");
            sc.close();
        }
    }
}
