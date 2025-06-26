package problems.Easy.Remove_Element;

// https://leetcode.com/problems/remove-element/

public class Solution {
    public int removeElement(int[] nums, int val) {
        int mark = 0, tmp = 0;
        while(tmp < nums.length){
            if(nums[tmp] != val){
                nums[mark] = nums[tmp];
                mark++;
                tmp++;
            } else {
                tmp++;
            }
        }
        return mark;
    }
}