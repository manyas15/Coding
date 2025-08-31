package Basic;
public class Nto1Rec {
    public static void main(String[] args) {
        fun(5);
    }

    static void fun(int n) {
        if (n == 0) {
            return;
        }

        System.err.println(n);
        fun(n - 1);
    }
}
