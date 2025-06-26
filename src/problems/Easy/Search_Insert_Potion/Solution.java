package problems.Easy.Search_Insert_Potion;

// https://leetcode.com/problems/search-insert-position/

public class Solution {
    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length;

        while(left < right){
            int mid = left + (right-left)/2;
            if(nums[mid] < target){
                left = mid+1;
            } else {
                right = mid;
            }
        }
        return left;
    }
}