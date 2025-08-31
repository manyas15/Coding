import java.util.Arrays;
import java.util.Scanner;

public class ArrPrimitive {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int arr[] = new int[5];

        // for(int i = 0; i < arr.length;i++){
        //     arr[i] = input.nextInt();
        //     System.out.print(arr[i] + " ");
        // }
        for(int i = 0; i < arr.length;i++){
            arr[i] = input.nextInt();
        }

        // or
        System.out.println(Arrays.toString(arr));

        // for(int i : arr){
        //     System.out.print(i + " ");
        // }
    }
}
