import java.util.Scanner;
import java.util.ArrayList;

public class ArrList2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            list.add(input.nextInt());
        }

        // get item at any index

        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i)); // pass index here
        }
    }
}
