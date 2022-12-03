package algorithms;

/*
Given an unsorted array A of size N that contains only non-negative integers,
find a continuous sub-array which adds to a given number S and return the left and right index of that subarray.
In case of multiple subarrays, return the subarray indexes which comes first on moving from left to right.
Note:- Both the indexes in the array should be according to 1-based indexing.
 You have to return an arraylist consisting of two elements left and right.
 In case no such subarray exists return an array consisting of element -1.

Example 1:

Input:
N = 5, S = 12
A[] = {1,2,3,7,5}
Output: 2 4
Explanation: The sum of elements
from 2nd position to 4th position
is 12.

Example 2:
Input:
N = 10, S = 15
A[] = {1,2,3,4,5,6,7,8,9,10}
Output: 1 5
Explanation: The sum of elements
from 1st position to 5th position
is 15.


Your Task:
You don't need to read input or print anything. The task is to complete the function subarraySum()
which takes arr, N, and S as input parameters and returns an arraylist containing the starting and ending
positions of the first such occurring subarray from the left where sum equals to S. The two indexes in the
array should be according to 1-based indexing. If no such subarray is found, return an array consisting of
only one element that is -1.


*/


import java.util.ArrayList;

public class SubArraySum {

    public static void main(String[] args) {
        subArraySub(new int[]{1,2,3,7,5}, 12);
        subArraySub(new int[]{1,2,3,4,5,6,7,8,9,10}, 15);
    }
    public static void subArraySub(int[] array, int sum){
        ArrayList<Integer>  newArray = new ArrayList<>();
//        pick a start index
        for(int i= 0; i<array.length; i++){
            int currentSum = array[i];
            if (currentSum == sum) {
//                System.out.println("the index of " + i );
                System.out.println(newArray.add(i));
                return;
            } else {
                for (int j = i + 1; j < array.length; j++) {
                    currentSum += array[j];
                    if (currentSum == sum) {
//                        System.out.printf("the start index is " + i + " and the ending is " + j );
                        newArray.add(i);
                        newArray.add(j);
                        System.out.println(newArray);
                        return;
                    }
                }
            }

           }
        System.out.println(" no sub array ");
        }



}

