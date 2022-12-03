package algorithms;
/*
given an array of numbers, multiply each number in the array by the
number of elements in the array in descending order.
example input [1,2,3,4,5] return [5,8,9,8,5]
*/

import java.util.ArrayList;
import java.util.Arrays;

public class ReverseMultiple {

    public static void main(String[] args) {
        System.out.println(removeEvenInteger(new ArrayList<>(Arrays.asList(1,2,3,4,5))));
        System.out.println(removeEvenInteger(new ArrayList<>(Arrays.asList(10,1,2,3,4,5, 6,9,4))));
    }
    public static ArrayList<Integer> removeEvenInteger(ArrayList<Integer> array) {
        ArrayList<Integer> newArray = new ArrayList<Integer>();
        int countdown = array.size();
            for (int j = 0; j<array.size(); j++) {
                int b =  array.get(j);
                newArray.add(b * (array.size()-j));
        }
        return newArray;
    }
}
