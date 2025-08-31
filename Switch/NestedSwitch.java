import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter employee ID: ");

        int empId = input.nextInt();

        switch (empId) {
            case 1:
                System.out.println("Kunal");
                break;
            case 2:
                System.out.println("Rahul");
                break;
            case 3:
                String department = input.next();
                System.out.print("Employee no 3: ");

                switch (department) {
                    case "IT":
                        System.out.println("Employee is from IT department");
                        break;
                    case "MBA":
                        System.out.println("Employee is from MBA department");
                        break;
                    default:
                        System.out.println("Enter correct department");
                        break;
                }
                break;
            default:
                System.out.println("Enter correct employee ID");
                break;
        }
    }
}
