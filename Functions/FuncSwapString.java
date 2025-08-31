public class FuncSwapString {
    public static void main(String[] args) {
        String name = " Kunal";
        System.out.println("before change: "+name);
        name = changename(name);
        System.out.println("after change: "+name);
    }

    static String changename(String naam){
         naam = "rahul";
         return naam;
    }
}
