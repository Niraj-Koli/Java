package Vectors;

import java.util.Enumeration;
import java.util.Vector;

public class Vectors {
    public static void main(String[] args) {
        Vector<Double> vector = new Vector<Double>();
        vector.add(10.07);
        vector.add(21.73);
        vector.add(56.91);

        System.out.println(vector);
        System.out.println(vector.size());

        vector.remove(1);

        Enumeration<Double> enumeration = vector.elements();

        while (enumeration.hasMoreElements()) {
            System.out.println(enumeration.nextElement());
        }
    }
}
