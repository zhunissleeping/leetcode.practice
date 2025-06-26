package problems.Easy.Remove_Duplicates_from_Sorted_Array;

import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        Solution sol = new Solution();

        int[] arr1 = {1,1,2};
        System.out.println(sol.removeDuplicates(arr1));
        System.out.println(Arrays.toString(arr1));

        int[] arr2 = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(sol.removeDuplicates(arr2));
        System.out.println(Arrays.toString(arr2));
    }
}
