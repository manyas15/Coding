
public class FirstAndLastPosition {
    public static void main(String[] args) {
        int[] nums = { 2, 3, 7, 7, 7, 7, 8 };
        int target = 7;

        int[] ans = searchRange(nums, target);
    
        System.out.println("[" + ans[0] + ", " + ans[1] + "]");
    }

    static int[] searchRange(int[] nums, int target) {

        int[] ans = { -1, -1 };
        // check for first occurrence if target first

        ans[0] = search(nums, target, true);
        if (ans[0] != -1) {
            ans[1] = search(nums, target, false);   //If the first occurrence is found (ans[0] != -1), calls search(nums, target, false) to find the last occurrence.
        }
        return ans;          //Returns the [firstIndex, lastIndex] pair.
    }

    // this function just returns the index value of target

    static int search(int[] nums, int target, boolean findStartIndex) {
        int ans = -1;
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;                // find the middle element

            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {                                         // potential ans found
                ans = mid;
                if (findStartIndex) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
}