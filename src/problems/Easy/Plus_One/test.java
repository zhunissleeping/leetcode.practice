package problems.Easy.Plus_One;

import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        Solution sol = new Solution();

        System.out.println(Arrays.toString(sol.plusOne(new int[]{1,2,3})));
        System.out.println(Arrays.toString(sol.plusOne(new int[]{4,3,2,1})));
        System.out.println(Arrays.toString(sol.plusOne(new int[]{9})));
    }
}