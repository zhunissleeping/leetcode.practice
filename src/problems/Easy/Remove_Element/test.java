package problems.Easy.Remove_Element;

import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        Solution sol = new Solution();

        int[] arr1 = {3,2,2,3};
        System.out.println(sol.removeElement(arr1, 3));
        System.out.println(Arrays.toString(arr1));

        int[] arr2 = {0,1,2,2,3,0,4,2};
        System.out.println(sol.removeElement(arr2, 2));
        System.out.println(Arrays.toString(arr2));
    }
}
