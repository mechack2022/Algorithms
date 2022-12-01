package algorithms;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveEvenInteger {

    public static void main(String[] args) {
        System.out.println(removeEvenInteger(new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8))));
    }

//    thnis method remove evne integer form this array of numbers
    public static ArrayList<Integer> removeEvenInteger(ArrayList<Integer> array){
        ArrayList<Integer>  newArray = new ArrayList<Integer>();
        if(array.size() == 0){
            return array ;
        }
        for(int i = 0; i<array.toArray().length; i++){
            int indexValue = array.get(i);
            if(indexValue % 2 == 1){
                newArray.add(indexValue);
            }
        }
      return newArray;
    }
}
