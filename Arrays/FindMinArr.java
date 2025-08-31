public class FindMinArr {
    public static void main(String[] args) {
        int[] arr = { 18, 45, 23, 1, 2, 7 };
        System.out.println(min(arr));
    }

    static int min(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
}
