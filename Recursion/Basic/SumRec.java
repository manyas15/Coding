package Recursion.Basic;
public class SumRec {
    public static void main(String[] args) {
        System.out.println(sum(0));
    }

    static int sum(int n) {
        if (n == 0) {
            return 0;
        }

        return n + sum(n - 1);
    }
}
