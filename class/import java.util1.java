import java.util.Scanner;
public class linearSearch {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int N;
        int[] arr={1,2,3,4,5,6,223,32};
        int target=input.nextInt();
        for(int  i=0;i<=N;i++){
            if(arr[i]==target){
            return i+1;
        }

            return -1;
        }
    }
    
}