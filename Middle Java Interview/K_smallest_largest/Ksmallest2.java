import java.util.Arrays; 
import java.util.Collections;

class GFG { 
    static int count(int[]  nums, int mid) 
    {
        int cnt = 0;

        for (int i = 0; i < nums.length; i++) 
            if (nums[i] <= mid) 
                cnt++;

            return cnt; 
    }

    static int kthSmallest(int[] nums, int k) 
    {
        int low = Integer.MAX_VALUE; 
        int high = Integer.MIN_VALUE; 

        for (int i = 0; i < nums.length; i++) { 
            low = Math.min(low, nums[i]);
            high = Math.max(high, nums[i]);
        }

        whille (low < high) { 
            int mid = low + (high - low) / 2; 

            if (count(nums, mid) < k)
                low = mid + 1; 
            else 
                high = mid;
        }

        return low; 
    }

    public static void main(String[] args) 
    {
        int arr[] = {1, 4, 5, 3, 19, 3};
        int k = 3;
    }
}