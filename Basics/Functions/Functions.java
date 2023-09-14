package Functions;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Function;

public class Functions {
    public static void main(String[] args) {
        Protogonist gojo = new Protogonist("Gojo Satoru", 31);
        Protogonist jinwoo = new Protogonist("Sung Jinwoo", 26);
        Protogonist luffy = new Protogonist("Monkey D. Luffy", 21);
        Protogonist levi = new Protogonist("Levi Ackerman", 37);
        Protogonist ichigo = new Protogonist("Ichigo Kurosaki", 23);

        List<Protogonist> prot = new ArrayList<Protogonist>();
        prot.add(gojo);
        prot.add(jinwoo);
        prot.add(luffy);
        prot.add(levi);
        prot.add(ichigo);

        for (Protogonist pro : prot) {
            System.out.println(pro.getName());
        }

        System.out.println();

        Function<Protogonist, String> firstName = (Protogonist fName) -> fName.getName().substring(0,
                fName.getName().indexOf(' '));

        Function<Protogonist, String> lastName = (Protogonist lName) -> lName.getName()
                .substring(lName.getName().indexOf(" ") + 1);

        Random random = new Random();

        for (Protogonist pro : prot) {
            if (random.nextBoolean()) {
                System.out.println(getAName(firstName, pro));
            } else {
                System.out.println(getAName(lastName, pro));
            }
        }

    }

    private static String getAName(Function<Protogonist, String> getName, Protogonist pro) {
        return getName.apply(pro);
    }
}
