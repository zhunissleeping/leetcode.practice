package problems.Easy.Roman_to_Integer;

// https://leetcode.com/problems/roman-to-integer/

import java.util.HashMap;

public class Solution {
    public int romanToInt(String s) {
        HashMap<Character, Integer> listNumbers = new HashMap<>();
        listNumbers.put('I', 1);
        listNumbers.put('V', 5);
        listNumbers.put('X', 10);
        listNumbers.put('L', 50);
        listNumbers.put('C', 100);
        listNumbers.put('D', 500);
        listNumbers.put('M', 1000);

        int answer = 0;
        int preValue = 0;

        for(int i = s.length()-1; i >= 0; i--){
            int currentNumber = listNumbers.get(s.charAt(i));
            if(preValue > currentNumber){
                answer-=currentNumber;
            } else {
                answer+=currentNumber;
            }
            preValue = currentNumber;
        }

        return answer;
    }
}
