package algorithms;

/*

Given an array of size N-1 such that it only contains distinct integers in t
he range of 1 to N. Find the missing element.

Example 1:

Input:
N = 5
A[] = {1,2,3,5}
Output: 4
Example 2:

Input:
N = 10
A[] = {6,1,2,8,3,4,7,10,5}
Output: 9

Your Task :
You don't need to read input or print anything. Complete the function MissingNumber() that
takes array and N as input  parameters and returns the value of the missing number.


Expected Time Complexity: O(N)
Expected Auxiliary Space: O(1)


*/


public class IsMissingNumber {

    public static void main(String[] args) {
        System.out.println(isMissingNumber(new int[]{6, 1, 2, 8, 3, 4, 7, 10, 5}, 10));
        System.out.println(new );
    }

    public static int isMissingNumber(int[] arr, int N) {
        int expectedSum = 0;
        int sum_of_arr = 0;
        for (int i = 1; i <N+1; i++) {
            expectedSum += i;
        }
        for (int i = 0; i < arr.length; i++) {
            sum_of_arr += arr[i];

        }
        int missingNumber = expectedSum - sum_of_arr;
        return missingNumber;
    }
}
