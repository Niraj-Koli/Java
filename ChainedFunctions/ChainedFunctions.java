package ChainedFunctions;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class ChainedFunctions {
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

        Function<Protogonist, String> upperCase = pro -> pro.getName().toUpperCase();

        Function<String, String> firstName = name -> name.substring(0, name.indexOf(" "));

        Function<Protogonist, String> chainedFunction1 = upperCase.andThen(firstName);

        Function<String, String> lastName = name -> name.substring(name.indexOf(' ') + 1);

        Function<Protogonist, String> chainedFunction2 = upperCase.andThen(lastName);

        for (Protogonist pro : prot) {
            System.out.println(chainedFunction1.apply(pro) + " " + chainedFunction2.apply(pro));
        }

    }
}