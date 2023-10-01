package Strings;

public class Strings {
    public static void main(String[] args) {
        String kaizer = "Kaizer";

        String williams = new String("Williams");

        System.out.println(kaizer + " " + williams);
        System.out.println(kaizer.charAt(3));

        StringBuilder str = new StringBuilder();

        str.append(kaizer);
        str.append(" ");
        str.append(williams);

        System.out.println(str + " " + str.getClass());

        System.out.println(str.length() + " " + str.capacity());

        System.out.println(str.toString() + " " + str.toString().getClass());

        str.insert(7, "Icarus ");

        System.out.println(str.toString());

        System.out.println(str.charAt(10));

        System.out.println(str.length() + " " + str.capacity());

        str.reverse();

        System.out.println(str.toString());

        String what = "Seriously";

        StringBuilder whatever = new StringBuilder(what);

        System.out.println(whatever.toString());
    }
}
