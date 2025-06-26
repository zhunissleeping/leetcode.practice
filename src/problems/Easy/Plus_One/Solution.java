package problems.Easy.Plus_One;

// https://leetcode.com/problems/plus-one/

public class Solution {
    public int[] plusOne(int[] digits) {
        if(digits[digits.length-1] < 9){
            digits[digits.length-1]++;
            return digits;
        } else {
            int i =  digits.length-1;
            while(digits[i] == 9){
                digits[i] = 0;
                i--;
                if(i == -1){
                    int[] newdigits = new int[digits.length+1];
                    newdigits[0] = 1;
                    return newdigits;
                }
            }
            digits[i]++;
            return digits;
        }
    }
}