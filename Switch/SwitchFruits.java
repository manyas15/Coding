import java.util.Scanner;

public class SwitchFruits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String fruit = input.next();
        
        switch (fruit) {
            case "Mango":
                System.out.println("King of Fruits");
                break;

            case "Apple":
                System.out.println("Sweet Fruits");
                break;

            case "Orange":
                System.out.println("Round Fruits");
                break;

            default:
                System.out.println("Invalid fruit");
        }
    }
}
