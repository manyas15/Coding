public class Shadowing {
    static int x = 90;
    public static void main(String[] args) {
        System.out.println("Before Shadowing: " + x);

        int x = 40;
        System.out.println("After Shadowing: "+ x);
        fun();
    }
    static void fun(){
        System.out.println("Outside the psvm func: "+ x);
    }
}
