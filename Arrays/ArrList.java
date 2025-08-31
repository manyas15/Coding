import java.util.ArrayList;

public class ArrList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>(10);

        list.add(67);
        list.add(7);
        list.add(6);
        list.add(77);
        list.add(69);

        System.out.println(list);

        System.out.println(list.contains(234));

        list.set(0, 90);
        System.out.println(list);

        list.remove(4);
        System.out.println(list);

    }
}
