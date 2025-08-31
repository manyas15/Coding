//no swap
public class FuncNoSwap {
    public static void main(String[] args) {
         int a = 2;
         int b = 3;
         swap(a,b);

         System.out.println(a + " " + b);
    }
    static void swap(int a , int b){
        int temp = a;
        a = b;
        b = temp;
    }
}
