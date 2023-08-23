package Lists;

import java.util.LinkedList;

public class Linked {
    public static void main(String[] args) {
        LinkedList<String> link = new LinkedList<String>();

        link.add("Kaizer");
        link.addFirst("Nero");
        link.addLast("Dante");
        link.add("Vivy");
        link.addFirst("Pearl");

        System.out.println(link);

        link.removeFirst();
        link.remove(2);
        link.removeLast();

        System.out.println(link);

        link.set(1, "Hertz");

        System.out.println(link);
    }

}
