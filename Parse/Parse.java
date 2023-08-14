package Parse;

public class Parse {
    public static void main(String[] args) {
        String numberAsString = "2023";
        System.out.println("Number As A String = " + numberAsString);

        int number = Integer.parseInt(numberAsString);
        System.out.println("Number = " + number);

        numberAsString += 1;
        number += 1;

        System.out.println("Number As A String = " + numberAsString);
        System.out.println("Number = " + number);
    }
}
