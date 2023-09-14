package Maps;

import java.util.HashMap;
import java.util.Map;

public class Maps {
    public static void main(String[] args) {

        // Map<> map = new TreeMap<>();
        // Map<> map = new LinkedHashMap<>();
        Map<String, String> buddies = new HashMap<String, String>();

        buddies.put("Watch", "Hertz");
        buddies.put("Glasses", "Dante");
        buddies.put("Buds", "Nero");

        System.out.println(buddies);
        System.out.println(buddies.size());

        buddies.remove("Buds");

        System.out.println(buddies);

        buddies.replace("Glasses", "Dante", "Azrael");

        System.out.println(buddies);

        System.out.println(buddies.containsKey("Watch"));
        System.out.println(buddies.containsKey("Buds"));

        System.out.println(buddies.keySet());
        System.out.println(buddies.values());
    }
}
