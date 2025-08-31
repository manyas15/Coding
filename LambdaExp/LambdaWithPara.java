
@FunctionalInterface
interface Operations {
    int operations(int a, int b);
}

public class LambdaWithPara {

    public static void main(String[] args) {
        Operations add = (a, b) -> a + b;
        Operations multiply = (a , b) -> a * b;
        System.out.println("Sum = " + add.operations(5, 6));
        System.out.println("Multiplication = " + multiply.operations(5, 6));

    }
}
