import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the no to reverse: ");

        int num = input.nextInt();
        int ans = 0;

        while (num > 0) {
            int rem = num % 10;
            num = num / 10;

            ans = ans * 10 + rem;
        }
        System.out.println("Reversed no is: " + ans);
    }
}
