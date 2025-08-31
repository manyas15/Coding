import java.util.Scanner;
public class ls2{
    public static void main(String[] args) {
        Scanner sc =new Scanner (System.in);
        int N=sc.nextInt();
        System.out.println("enter element");
        int[] arr=new int[N];
        for(int i=0;i<N;i++){
            arr[i]=sc.nextInt();

        }
        System.out.println("enter target element");
    }
}