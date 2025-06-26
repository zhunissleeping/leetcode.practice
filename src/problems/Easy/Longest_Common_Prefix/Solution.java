package problems.Easy.Longest_Common_Prefix;

// https://leetcode.com/problems/longest-common-prefix/

public class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }

        String answer = strs[0];
        for(int i = 1; i < strs.length; i++) {
            while(!strs[i].startsWith(answer)) {
                answer = answer.substring(0, answer.length() - 1);

                if(answer.length() == 0) {
                    return "";
                }
            }
        }
        return answer;
    }
}