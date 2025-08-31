import java.util.*;

public class charc {
    public static void main(String[] args) {
        String str="java programming";
        char ch[] =str.toCharArray();
        HashMap<Character,Integer> hmap=new HashMap<>();
        int i,j,count;
        for(i=0;i<ch.length;i++){
            count=1;
            for(j=i+1;j<ch.length;j++){
                if(ch[i]==ch[j]){
                    count++;
                }
            }
            if(!hmap.containsKey(ch[i])){
                hmap.put(ch[i],count);
            }
        }
        //System.out.println(hmap);
        TreeMap<Character,Integer> tmap=new TreeMap<>(hmap);
        System.out.println(tmap);

    }
}