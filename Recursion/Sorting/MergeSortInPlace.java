
import java.util.Arrays;

// package Recursion.Sorting;
public class MergeSortInPlace {

    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 1};
        mergeSortInPlace(arr, 0, arr.length);
        System.out.println(Arrays.toString(arr));
    }

    static void mergeSortInPlace(int[] arr, int s, int e) {
        if (e - s == 1) {
            return;
        }
        int mid = (s + e) / 2;
        mergeSortInPlace(arr, s, mid);
        mergeSortInPlace(arr, mid, e);

        mergeSort(arr, s, mid, e);
    }

    private static void mergeSort(int[] arr, int s, int mid, int e) {
        int[] mix = new int[e - s];

        int i = s;
        int j = mid;
        int k = 0;

        while (i < mid && j < e) {
            if (arr[i] < arr[j]) {
                mix[k] = arr[i];
                i++;
            } else {
                mix[k] = arr[j];
                j++;
            }
            k++;
        }

        while (i < mid) {
            mix[k] = arr[i];
            i++;
            k++;
        }

        while (j < e) {
            mix[k] = arr[j];
            j++;
            k++;
        }

        System.arraycopy(mix, 0, arr, s, mix.length);
    }
}
