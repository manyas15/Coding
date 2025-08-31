import java.util.function.Supplier;

public class SupplierEg{
    public static void main(String[] args) {
        Supplier<String> greeting=() -> "Welcome to JAVA APC";
        System.out.println(greeting.get());
        
        //System.out.println(Math.random());  //will give any random no whenever u run
    }
}