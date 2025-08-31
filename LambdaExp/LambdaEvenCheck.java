
@FunctionalInterface
interface CheckEven {

    boolean isEven(int num);
}

public class LambdaEvenCheck {

    public static void main(String[] args) {

        CheckEven even = (num) -> num % 2 == 0;

        // int test = 24;
        // boolean result = even.isEven(test);
        
        System.out.println("is " + even.isEven(43));
    }
}
