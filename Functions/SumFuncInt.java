// Int will return the value of function 

import java.util.Scanner;

public class SumFuncInt {
    public static void main(String[] args) {
        int ans = sum();
        System.out.println("Sum is: " + ans);
    }

    static int sum() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter no 1: ");
        int num1 = input.nextInt();

        System.out.print("Enter no 2: ");
        int num2 = input.nextInt();

        int sum = num1 + num2;
        return sum;
    }
}
