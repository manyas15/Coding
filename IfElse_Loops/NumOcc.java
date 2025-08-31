import java.util.Scanner;

public class NumOcc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the no: ");
        int n = input.nextInt();

        System.out.print("Enter the digit to count: ");
        int digitToCount = input.nextInt();
        int count = 0;

        while (n > 0) {
            int rem = n % 10;
            if (rem == digitToCount) {
                count++;
            }
            n = n / 10;
        }
        System.out.println(digitToCount + " appears " + count + " times ");
    }
}
