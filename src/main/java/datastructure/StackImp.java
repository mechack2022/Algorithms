package datastructure;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Stack;

public class StackImp {

    public static void main(String[] args) {
        int[] l = {8, 9, 3, 20, 38, 4, 5};
        Stack<Integer> s = new Stack<Integer>();
        for (int i : l) {
            s.push(i);
        }
        s.push(5);
        System.out.println(s);

        Iterator it = s.iterator();
        while (it.hasNext()) {
            ;
            System.out.print(" " + it.next());
        }
        s.sort(null);
        System.out.println("stack element after sorted:");

    }

}
