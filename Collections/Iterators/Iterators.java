package Iterators;

import java.util.ArrayList;
import java.util.Iterator;

public class Iterators {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<Integer>();

        nums.add(10);
        nums.add(7);
        nums.add(21);
        nums.add(2);
        nums.add(47);

        Iterator<Integer> iterator = nums.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
