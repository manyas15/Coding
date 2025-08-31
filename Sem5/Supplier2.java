
import java.util.HashMap;

public class Supplier2 {
    public static void main(String[] args) {
        String str = "HELLO WORLD";
        char ch[] = str.toCharArray();
        HashMap<Character, Integer> hmap = new HashMap<>();

        for(int i = 0; i < ch.length; i++){
            hmap.put(ch[i] , hmap.getOrDefault(ch[i] , 0) + 1);
        }

        System.out.println(hmap);
    }
}
