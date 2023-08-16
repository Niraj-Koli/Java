package ListIterators;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIterators {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<Integer>();

        nums.add(10);
        nums.add(7);
        nums.add(21);
        nums.add(2);
        nums.add(47);

        ListIterator<Integer> iterator = nums.listIterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        iterator.add(73);

        System.out.println(nums);

        while (iterator.hasPrevious()) {
            System.out.println(iterator.previous());
        }

        iterator.add(91);

        System.out.println(nums);
    }
}
