import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the no: ");

        int n = input.nextInt();
        System.out.println(isArmstrong(n));
    }

    static boolean isArmstrong(int n) {
        int original = n;
        int sum = 0;
        while (n > 0) {
            int rem = n % 10;
            n = n / 10;
            int cube = rem * rem * rem;
            sum += cube;
        }

        if (sum == original) {
            return true;
        }
        return false;
    }
}
