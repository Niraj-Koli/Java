package Sets;

import java.util.HashSet;
import java.util.Set;

public class Sets {
    public static void main(String[] args) {

        // Set<> set = new TreeSet<>();
        // Set<> set = new LinkedHashSet<>();
        Set<Integer> set = new HashSet<Integer>();

        set.add(10);
        set.add(7);
        set.add(21);
        set.add(10);

        System.out.println(set);
        System.out.println(set.size());

        System.out.println(set.contains(7));

        set.remove(21);

        System.out.println(set);
    }
}
