
import java.util.*;

public class Collection {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        List<Integer> list2 = new LinkedList<>();

//        list2.add(34);
//        list2.add(78);
//        list2.add(55);
//        list2.add(89);
//
//        System.out.println(list2);
        List<Integer> vector = new Vector<>();
        vector.add(45);
        vector.add(5);
        vector.add(15);
        vector.add(56);  //will print the same but is slow thats why arraylist is used 

        System.out.println(vector);
    }
}
