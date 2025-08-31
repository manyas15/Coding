import java.util.Scanner;

public class SwitchDays {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the case: ");

        int days = input.nextInt();
        switch (days) {
            case 1,2,3,4,5 -> System.out.println("Weekdays");

            case 6,7 -> System.out.println("Weekend");

            default -> System.out.println("Invalid input");
        }
    }
}
