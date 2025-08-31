public class FuncNoSwapVoid {
    public static void main(String[] args) {
        String name = " Kunal";
        System.out.println("before change: "+name);
        changename(name);
        System.out.println("after change: "+name);
    }

    static void changename(String naam){    //creating a new object // string are final classes - immutable
         naam = "rahul";
         System.out.println("Inside changeString: "+naam);
    }
}
