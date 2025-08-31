import java.util.Arrays;

public class FuncOverloading {
    public static void main(String[] args) {
        System.out.println("First func: ");
        fun(67, 56, 78, 8);

        System.out.println("Second Func: ");
        fun("Manya", "Manvi", "Aadi");
    }

    // static void fun(int a){
    // System.out.println(a);
    // }
    // static void fun(String a){
    // System.out.println(a);
    // }

    static void fun(int... v) {
        System.out.println(Arrays.toString(v));
    }

    static void fun(String... v) {
        System.out.println(Arrays.toString(v));
    }
}
