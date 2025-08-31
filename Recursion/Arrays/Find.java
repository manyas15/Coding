
public class Find {
    public static void main(String[] args) {
        int[] arr = {12,34,55,67,4};
        System.out.println(find(arr, 4, 0));
        System.out.println(findIndex(arr, 4, 0));
    }

    static boolean find(int[] arr , int target , int index){
        if(index == arr.length){
            return false;
        }
         
        return arr[index] == target || find(arr, target, index + 1);
    }

    static int findIndex(int[] arr , int target , int index){
        if(index == -1){
            return -1;
        }
        if(index == target){
            return index;
        }
        else{
            return findIndex(arr, target, index + 1);
        }
    }
}
