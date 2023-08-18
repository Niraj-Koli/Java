package CollectionInterface;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionInterface {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>();

        arr.add(10);
        arr.add(7);
        arr.add(21);
        arr.add(47);
        arr.add(73);

        System.out.println(arr);

        Collections.reverse(arr);

        System.out.println(arr);

        Collections.sort(arr);

        System.out.println(arr);
    }
}
