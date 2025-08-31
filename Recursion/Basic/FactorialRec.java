package Basic;
public class FactorialRec {
    public static void main(String[] args) {
        // int ans = fac(5);
        System.out.println(fac(0));
    }

    static int fac(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * fac(n - 1);
    }
}
