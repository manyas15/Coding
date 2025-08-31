
public class Basic {

    public static void main(String[] args) {
        int a = 5;
        int b = 0;

        try {
            // int c = a / b;
            //mimicing                                               // just showing order 
            throw new Exception("just for fun");
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("normal exception");
        } finally {
            System.out.println("this will execute where exception will run or not");
        }
    }

    static int divide(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("please dont divide by zero");
        }
        return a / b;
    }
}
