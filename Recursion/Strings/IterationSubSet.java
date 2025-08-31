
import java.util.*;

public class IterationSubSet {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        List<List<Integer>> ans = subset(arr);
        for (List<Integer> list : ans) {
            System.out.println(list);
        }
        
        int[] array = {1, 2, 2};
        List<List<Integer>> answer = subset(array);
        for (List<Integer> list : answer) {
            System.out.println(list);
        }
    }

    static List<List<Integer>> subset(int[] arr) {
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>()); //empty

        for (int num : arr) {
            int n = outer.size();
            for (int i = 0; i < n; i++) {
                List<Integer> internal = new ArrayList<>(outer.get(i));

                internal.add(num);
                outer.add(internal);
            }
        }
        return outer;
    }

    static List<List<Integer>> subsetDup(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>()); //empty

        int start = 0;
        int end = 0;

        for (int i = 0; i < arr.length; i++) {
            start = 0;

            //if current and previous element is same s = e + 1;
            if (i > 0 && arr[i] == arr[i - 1]) {
                start = end + 1;
            }
            int n = outer.size();
            for (int j = start; j < n; j++) {
                List<Integer> internal = new ArrayList<>(outer.get(j));

                internal.add(i);
                outer.add(internal);
            }
        }
        return outer;
    }
}
