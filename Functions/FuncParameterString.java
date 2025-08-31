import java.util.Scanner;

public class FuncParameterString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = input.next();

        String personalised = greet(name);
        System.out.println(personalised);
    }

    static String greet(String name){
        String greet = "hello " + name;
        return greet;
    }
}
