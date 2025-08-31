public class LinerSearchString {
    public static void main(String[] args) {
        String str = "Manya";
        char target = 'a';
        boolean ans = search(str, target);

        System.out.println(ans);
    }

    static boolean search(String str , char target){
        for(int i = 0 ; i < str.length() ; i++){
            if(str.charAt(i) == target){
                 return true;
            }
        }
        return false;
    }
}