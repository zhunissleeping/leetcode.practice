package problems.Easy.Valid_Parenthese;

// https://leetcode.com/problems/valid-parentheses/

import java.util.Stack;

public class Solution {
    public boolean isValid(String s) {
        int len = s.length();
        if(len%2==1 ||
                s.charAt(0)==')' || s.charAt(0)==']' || s.charAt(0)=='}' ||
                s.charAt(len-1)=='(' || s.charAt(len-1)=='[' || s.charAt(len-1)=='{') {
            return false;
        }

        Stack<Character> temp = new Stack();
        for(int i = 0; i < len; i++) {
            if(s.charAt(i)=='(' ||  s.charAt(i)=='[' ||  s.charAt(i)=='{') {
                temp.push(s.charAt(i));
            } else if((s.charAt(i)==')' && !temp.isEmpty() &&  temp.peek()=='(') ||
                    (s.charAt(i)==']' && !temp.isEmpty() &&  temp.peek()=='[') ||
                    (s.charAt(i)=='}' && !temp.isEmpty() &&  temp.peek()=='{')) {
                temp.pop();
            } else {
                return false;
            }
        }

        return temp.isEmpty();
    }
}
