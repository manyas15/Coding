public class EvenDigitCount {
    public static void main(String[] args) {
        int[] arr = { 3, 6779 , 99 , 97 , 95};

        System.out.println(findNumber(arr));
    }

    static int findNumber(int[] arr) {
        int count = 0;
        for (int i : arr) {
            if (even(i)) {
                count++;
            }
        }
        return count;
    }

    static boolean even(int num) {
        int numberOfDigits = digits(num);

        return numberOfDigits % 2 == 0;
    }

    static int digits(int num) {

        if (num < 0) {
            num = num * -1;
        }
        if (num == 0) {
            return 1;
        }

        int count = 0;
        while (num > 0) {
            count++;
            num = num / 10;
        }
        return count;
    }

    // static int digits(int num){
    //     return (int)(Math.log10(num) + 1);
    // }

}