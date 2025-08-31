
import java.util.ArrayList;


public class SubSeq {

    public static void main(String[] args) {
        subset("", "abc");
        System.out.println(seqArray("", "abcd"));
    }

    static void subset(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        subset(p + ch, up.substring(1));
        subset(p, up.substring(1));

        //opp direction
        // subset(p, up.substring(1));
        // subset(p + ch, up.substring(1));
        
    }

    static ArrayList<String> seqArray(String p , String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);

        ArrayList<String> left = seqArray(p + ch, up.substring(1));
        ArrayList<String> right = seqArray(p, up.substring(1));

        left.addAll(right);
        return left; 
    }
}
