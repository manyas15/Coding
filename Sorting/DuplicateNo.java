
public class DuplicateNo {

    public int findDuplicate(int[] nums) {
        //     int i = 0;
        //     while(i < arr.length){
        //         if(arr[i] != i + 1){
        //         int correct = arr[i] - 1;
        //         if(arr[i] != arr[correct]){
        //             swap(arr, i, correct);
        //         }
        //         else{
        //             return arr[i];
        //         }
        //     }
        //     else{
        //         i++;
        //     }
        //   }
        //   return -1;
        // }
        // static void swap(int[] arr , int first , int second ){
        //     int temp = arr[first];
        //     arr[first] = arr[second];
        //     arr[second] = temp;

        int n = nums.length;
        int[] count = new int[n]; // because nums contain values from 1 to n-1

        for (int num : nums) {
            count[num]++;
            if (count[num] > 1) {
                return num;
            }
        }

        return -1;
    }
}
