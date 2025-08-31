import java.util.ArrayList;

public class SwapFunc {

    public static void main(String[] args) {
        ArrayList <Integer> sum = new ArrayList<>();
        String name = "Manya";
        name = change(name);
        // change(name);  --> will print manya 
        System.out.println(name);
    }

    static String change(String naam) {
        naam = "Sachdeva";
        return naam;
    }
}
