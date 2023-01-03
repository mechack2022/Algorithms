package algorithms;

import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/*
*

You are given an array of up to four non-negative integers, each less than 256.
Your task is to pack these integers into one number M so that the first element of
the array occupies the first (or least significant) 8 bits of M; the second element occupies next 8 bits, and so on.
Return the obtained integer M as unsigned integer.
Note
As indicated the first 8 bits are the least significant bits of M, meaning the right-most bits of the integer.
For further clarification see the following example.
* Return Value
Integer - an unsigned integer
Constraints
array.length == 3
0 ≤ array[i] < 256
Example
For [24, 85, 0] the output should be 21784
[24,       85,       0       ] - The initial array
[00011000, 01010101, 00000000] - Translate each number to Binary
   000000000101010100011000    - Compact to a single number
            21784              - Translate to Decimal
*/
    public class ArrayPacking {
        public static void main(String[] args) {
            System.out.println(arrayPacking1(new int[]{24, 85, 0}));
        }

        public static long arrayPacking1(int[] arr) {
            return Long.parseLong(IntStream.range(0, arr.length)
                    .map(x -> arr[arr.length - 1 - x])
                    .mapToObj(Integer::toBinaryString)
                    .mapToInt(Integer::parseInt)
                    .mapToObj(x -> String.format("%08d", x))
                    .collect(Collectors.joining()), 2);
        }
        public static long arrayPacking2(int[] arr) {
            long s = 0;
            for (int i = 0; i < arr.length; i++) {
                s += arr[i] * Math.pow(2, i * 8);
            }
            return s;
        }
    }



