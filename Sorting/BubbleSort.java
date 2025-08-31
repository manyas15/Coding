
import java.util.*;

public class BubbleSort {

    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};

        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void bubble(int[] arr) {

        //boolean swapped;
        for (int i = 0; i < arr.length; i++) {
            //swapped = false;
            // int swaps = 0;
            for (int j = 1; j < arr.length - i; j++) {

                if (arr[j] < arr[j - 1]) {
                    // int temp = arr[j];
                    // arr[j] = arr[j - 1];
                    // arr[j - 1] = temp;

                    swap(arr, j, j - 1);

                    //swapped = true;
                    // swaps++;
                }
            }
            // if (!swapped) {
            //     break;
            // }

            // if(swaps == 0){
            //     break;
            // }
        }
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
