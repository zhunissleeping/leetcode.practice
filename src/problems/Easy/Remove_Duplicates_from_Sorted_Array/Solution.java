package problems.Easy.Remove_Duplicates_from_Sorted_Array;

// https://leetcode.com/problems/remove-duplicates-from-sorted-array/

public class Solution {
    public int removeDuplicates(int[] nums) {
        int tmp = 1;
        int i = 0;
        //int len = nums.length;
        while(tmp < nums.length) {
            if(nums[tmp] != nums[i]) {
                nums[i+1] = nums[tmp];
                i++;
            }
            tmp++;
        }
        return i+1;
    }
}