package Regex;

public class Regex {
    public static void main(String[] args) {
        String string = "I am Faith, the last hope, which leads to the Faith.";
        System.out.println(string);
        String str = string.replaceAll("Faith", "Kaizer");
        System.out.println(str);

        System.out.println();

        String alphanumeric = "AeIou1007nEDn123jjifp40zAB34213421CDrmrAeIou2BC8433mpkd893";
        System.out.println(alphanumeric.replaceAll("\\.", "X"));
        System.out.println(alphanumeric.replaceAll(".", "X"));

        System.out.println();

        System.out.println(alphanumeric.replaceAll("^AeIou", "YYY"));

        System.out.println();

        System.out.println(alphanumeric.matches("^hello"));
        System.out.println(alphanumeric.matches("^AeIou"));
        System.out.println(alphanumeric.matches("AeIounnni23jjifp40zrmrAeIoummpkd893"));

        System.out.println();

        System.out.println(alphanumeric.replaceAll("mpkd893$", "THE END"));
        System.out.println(alphanumeric.replaceAll("[mno]", "Z"));
        System.out.println(alphanumeric.replaceAll("[mno]", "#&*"));
        System.out.println(alphanumeric.replaceAll("[mno][ipr]", "Z"));

        System.out.println();

        System.out.println(alphanumeric.replaceAll("[^AI]", "T"));

        System.out.println();

        System.out.println(alphanumeric.replaceAll("[abcde1234]", "T"));
        System.out.println(alphanumeric.replaceAll("[a-eA-E1-4]", "T"));
        System.out.println(alphanumeric.replaceAll("(?i)[a-e1-4]", "T"));

        System.out.println();

        System.out.println(alphanumeric.replaceAll("[0-9]", "T"));
        System.out.println(alphanumeric.replaceAll("\\d", "T"));
        System.out.println(alphanumeric.replaceAll("\\D", "T"));

        System.out.println();

        String whiteSpace = "I know \tyou can't forget \nBy that tattoo on your shoulder";
        System.out.println(whiteSpace);
        System.out.println(whiteSpace.replaceAll("\\s", ""));
        System.out.println(whiteSpace.replaceAll("\\S", ""));

        System.out.println();

        System.out.println(whiteSpace.replaceAll("\t", "X"));
        System.out.println(whiteSpace.replaceAll("\\b", "X"));

        System.out.println();

        System.out.println(whiteSpace.replaceAll("\\w", "X"));
        System.out.println(alphanumeric.replaceAll("\\w", "X"));

        System.out.println();

        System.out.println("niraj".replaceAll("[Nn]iraj", "Nero"));
        System.out.println("Niraj".replaceAll("[Nn]iraj", "Nero"));

        System.out.println();

        String bike = "I want a bike";
        String car = "I want a car";

        String regex1 = "I want a \\w+.";
        System.out.println(bike.matches(regex1));
        System.out.println(car.matches(regex1));

        String regex2 = "I want a (bike|car)";
        System.out.println(bike.matches(regex2));
        System.out.println(car.matches(regex2));
    }
}
