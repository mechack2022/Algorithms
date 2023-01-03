
/*Given an array arr[] of positive integers of size N. Reverse every sub-array group of size K.

Note: If at any instance, there are no more subarrays of size greater than or equal to K,
then reverse the last subarray (irrespective of its size). You shouldn't return any array, modify the given array in-place.

Example 1:
Input:
N = 5, K = 3
arr[] = {1,2,3,4,5}
Output: 3 2 1 5 4
Explanation: First group consists of elements
1, 2, 3. Second group consists of 4,5.

Example 2:

Input:
N = 4, K = 3
arr[] = {5,6,8,9}
Output: 8 6 5 9

Your Task:
You don't need to read input or print anything. The task is to complete the function reverseInGroups()
which takes the array, N and K as input parameters and modifies the array in-place.

Expected Time Complexity: O(N)
Expected Auxiliary Space: O(N)

Constraints:
1 ≤ N, K ≤ 10 raised to the power of 7
1 ≤ A[i] ≤ 10 raised to the power of 18
*/
package algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReverseInGroup {

    public static void main(String[] args) {
        int[] workingArrays = {1, 2, 3, 4, 5};
        int workingArraysCount = workingArrays.length;
        reverseInGroups(workingArrays, workingArraysCount, 3);
    }

    static void reverseInGroups(int[] arr, int n, int k) {
        if ((1 <= n) && (k <= Math.pow(10, 7))) {
                for (int i = 0; i < n; i += k)
                {
                    int left = i;
                    // to handle case when k is not multiple
                    // of n
                    int right = Math.min(i + k - 1, n - 1);
                    int temp;
                    // reverse the sub-array [left, right]
                    while (left < right)
                    {
                        temp=arr[left];
                        arr[left]=arr[right];
                        arr[right]=temp;
                        left+=1;
                        right-=1;
                    }
                }
            } else {
                System.out.println("check array input");
            }
        }

    }
