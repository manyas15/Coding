public class LinerSearch {
    public static void main(String[] args) {
        int[] arr = { 1, 14, 23, 34, 35, 46, 77 };
        int target = 34;

        int ans = linerSearch(arr, target);
        System.out.println(ans);
    }

    static int linerSearch(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] == target) {
                return index;
            }
        }
        return -1;
    }
}
