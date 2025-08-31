
public class FirstAndLastPositionEasy {

    public int[] searchRange(int[] nums, int target) {
        int[] ans = {-1, -1};
        ans[0] = firstOcc(nums, target);
        ans[1] = lastOcc(nums, target);
        return ans;
    }

    public int firstOcc(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        int res = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                res = mid;
                right = mid - 1;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return res;
    }

    public int lastOcc(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        int res = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                res = mid;
                left = mid + 1;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return res;
    }
}
