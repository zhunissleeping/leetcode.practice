package problems.Easy.Find_the_Index_of_the_First_Occurrence_in_a_String;

// https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/

public class Solution {
    public int strStr(String haystack, String needle) {
        int lenHaystack = haystack.length();
        int lenNeedle = needle.length();

        // if(lenHaystack < lenNeedle){
        //     return -1;
        // };

        // for(int i = 0; i <= lenHaystack-lenNeedle; i++){
        //     if(haystack.substring(i, i+lenNeedle).equals(needle)){
        //         return i;
        //     }
        // }
        // return -1;

        if(lenHaystack < lenNeedle){
            return -1;
        } else {
            return haystack.indexOf(needle);
        }
    }
}