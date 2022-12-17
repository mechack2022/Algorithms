package algorithms;

/*
problem: Rotate an array of n elements to the right by k steps. For example, with n = 7 and k = 3,
the array [1,2,3,4,5,6,7] is rotated to [5,6,7,1,2,3,4].
How many different ways do you know to solve this problem?

*/


import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
//    to print out the result u have to loop
        int[] arryResult = rotate(new int[]{1, 2, 3, 4, 5, 6, 7}, 3);
        for (int i = 0; i < arryResult.length - 1; i++) {
            System.out.print(arryResult[i] + " ");
        }
    }

    public static int[] rotate(int[] nums, int k) {
        if (k > nums.length) k = k % nums.length;
        int[] result = new int[nums.length];
        for (int i = 0; i < k; i++) {
            result[i] = nums[nums.length - k + i];
        }
        System.out.println(Arrays.toString(result));
        int j = 0;
        for (int i = k; i < nums.length - 1; i++) {
            result[i] = nums[j];
            j++;
        }
        return result;
    }
}
