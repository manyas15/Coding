
import java.util.*;

public class SelectionSort {

    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selection(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            // int last = arr.length - i - 1;

            int maxIndex = 0;
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j] > arr[maxIndex]) {
                    maxIndex = j;
                }
            }

            swap(arr, maxIndex, arr.length - i - 1);
        }
    }

    // static int getMaxIndex(int[] arr, int start, int end) {
    //     int max = start;
    //     for (int i = start; i <= end; i++) {
    //         if (arr[max] < arr[i]) {
    //             max = i;
    //         }
    //     }
    //     return max;
    // }
    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
