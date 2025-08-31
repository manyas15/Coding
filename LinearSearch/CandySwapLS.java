
import java.util.Arrays;

public class CandySwapLS {

    public int[] fairCandySwap(int[] a, int[] b) {
        int sumA = 0, sumB = 0;

        for (int num : a) {
            sumA += num;
        }
        for (int num : b) {
            sumB += num;
        }

        int diff = (sumA - sumB) / 2;

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i] - b[j] == diff) {
                    return new int[]{a[i], b[j]};
                }
            }
        }
        return new int[0];
    }

    public static void main(String[] args) {
        CandySwapLS sol = new CandySwapLS();

        int[] a = {1, 1};
        int[] b = {2, 2};

        int[] result = sol.fairCandySwap(a, b);
        System.out.println("Swap: " + Arrays.toString(result));
    }
}
