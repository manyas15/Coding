import java.util.Scanner;

public class Grade{
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.println("Enter marks: ");
       int ans = input.nextInt();
       num(ans); 
    }

    static void num(int n){
        if(n >= 80){
            System.out.println("A");
        }
        else if(n >= 70){
            System.out.println("B");
        }
        else if(n >= 60){
            System.out.println("C");
        }
        else if(n >= 50){
            System.out.println("D");
        }
        else {
            System.out.println("F");
        }
    }
}