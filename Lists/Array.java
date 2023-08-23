package Lists;

import java.util.ArrayList;
import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>();

        arr.add(10);
        arr.add(7);
        arr.add(21);

        System.out.println(arr);

        arr.remove(1);

        System.out.println(arr);

        arr.set(0, 47);
        arr.set(1, 56);

        System.out.println(arr);

        System.out.println(arr.get(1));

        System.out.println(Arrays.asList(arr));
    }

}
