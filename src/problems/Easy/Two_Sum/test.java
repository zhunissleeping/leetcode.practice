package problems.Easy.Two_Sum;

import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        Solution sol = new Solution();

        System.out.println(Arrays.toString(sol.twoSum(new int[]{2,7,11,15},9)));
        System.out.println(Arrays.toString(sol.twoSum(new int[]{3,2,4},6)));
        System.out.println(Arrays.toString(sol.twoSum(new int[]{3,3},6)));
    }
}
