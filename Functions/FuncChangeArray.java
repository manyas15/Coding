import java.util.Arrays;

public class FuncChangeArray {
    public static void main(String[] args) {
        int arr[] = {1,6,7,3,4,5};
        change(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void change(int [] nums){
        nums[0] = 99;  //if you make change to the object via this ref variable same object will be changed
    }
}
