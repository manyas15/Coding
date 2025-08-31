
// This is famous 3-pointer algorithm to sort an array of 0s, 1s, and 2s
// It is also known as the Dutch National Flag problem
// Time Complexity: O(n)
// Space Complexity: O(1)

public class DutuchAlorithm{
    public void sortColors(int[] nums) {
        int low = 0, mid = 0, high = nums.length - 1;

        while(mid <= high){
            if(nums[mid] == 0){
                swap(nums, low , mid);
                low++;
                mid++;
            }
            else if(nums[mid] == 1){
                mid++;
            }
            else{
                swap(nums, mid, high);
                high--;
            }
        }
    }

    private void swap(int[] nums, int first , int second){
        
            int temp = nums[first];
            nums[first] = nums[second];
            nums[second] = temp;
        
    }
}