package Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Streams {
    public static void main(String[] args) {

        List<String> someBingoNumbers = Arrays.asList(
                "N10", "N1", "n02",
                "K2", "K47", "k17", "K23",
                "L17", "l69", "L51", "l94", "L36",
                "A7", "A11", "a02", "A45",
                "J8", "j19", "J73");

        someBingoNumbers.forEach(number -> {
            if (number.toUpperCase().startsWith("L")) {
                System.out.println(number);
            }
        });

        System.out.println();

        someBingoNumbers
                .stream()
                .map(String::toUpperCase)
                .filter(s -> s.startsWith("L"))
                .sorted()
                .forEach(System.out::println);

        System.out.println();

        Stream<String> ivNumberStream = Stream.of("I24", "I17", "V73", "V20");
        Stream<String> cNumberStream = Stream.of("C4", "V20", "C88", "I48", "V13", "I17");

        Stream<String> concatStream = Stream.concat(ivNumberStream, cNumberStream);

        System.out.println(concatStream
                .distinct()
                .peek(System.out::println)
                .count());

        System.out.println();

        List<String> sortedNumbers = someBingoNumbers
                .stream()
                .map(String::toUpperCase)
                .filter(s -> s.startsWith("L"))
                .sorted()
                .collect(ArrayList::new, ArrayList::add, ArrayList::addAll);

        for (String s : sortedNumbers) {
            System.out.println(s);
        }

        System.out.println();

        Stream.of("NRJ", "VBHV", "ATY")
                .filter(s -> {
                    System.out.println(s);
                    return s.length() == 3;
                })
                .count();
    }
}
