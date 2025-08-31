package Basic;
public class ReverseNoRec {
    public static void main(String[] args) {
        rev(1234);
        System.out.println(sum);
    }

    static int sum = 0;

    static int rev(int n) {
        if (n == 0) {
            return sum;
        }

        int rem = n % 10;
        sum = sum * 10 + rem;
        return rev(n / 10);
    }

}
