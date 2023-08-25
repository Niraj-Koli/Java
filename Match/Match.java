package Match;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Match {
    public static void main(String[] args) {
        // matches() --> Should match full string otherwise will give false //

        StringBuilder htmlText = new StringBuilder("<h1>Java Regular Expression</h1>");
        htmlText.append("<h2> Header </h2>");
        htmlText.append("<p> Content </p>");
        htmlText.append("<h2> Footer </h2>");
        htmlText.append("<h1> The End </h1");

        String h2Pattern1 = ".*<h2>.*";

        Pattern pattern1 = Pattern.compile(h2Pattern1);
        Matcher matcher1 = pattern1.matcher(htmlText);

        System.out.println(matcher1.matches());

        matcher1.reset();

        int count = 0;

        while (matcher1.find()) {
            count++;
            System.out.println("Occurrence " + count + " : " + matcher1.start() + " to " + matcher1.end());
        }

        System.out.println();

        String h2Pattern2 = "<h2>";

        Pattern pattern2 = Pattern.compile(h2Pattern2);
        Matcher matcher2 = pattern2.matcher(htmlText);

        System.out.println(matcher2.matches());

        matcher2.reset();

        int counter = 0;

        while (matcher2.find()) {
            counter++;
            System.out.println("Occurrence " + counter + " : " + matcher2.start() + " to " + matcher2.end());
        }

        System.out.println();

        String h2GroupPattern1 = "(<h2>)";

        Pattern groupPatter1 = Pattern.compile(h2GroupPattern1);
        Matcher groupMatcher1 = groupPatter1.matcher(htmlText);

        System.out.println(groupMatcher1.matches());

        groupMatcher1.reset();

        while (groupMatcher1.find()) {
            System.out.println("Occurrence: " + groupMatcher1.group(1));
        }

        System.out.println();

        String h2GroupPattern2 = "(<h2>.*</h2>)";

        Pattern groupPatter2 = Pattern.compile(h2GroupPattern2);
        Matcher groupMatcher2 = groupPatter2.matcher(htmlText);

        System.out.println(groupMatcher2.matches());

        groupMatcher2.reset();

        while (groupMatcher2.find()) {
            System.out.println("Occurrence: " + groupMatcher2.group(1));
        }

        System.out.println();

        String h2GroupPattern3 = "(<h2>.*?</h2>)";

        Pattern groupPatter3 = Pattern.compile(h2GroupPattern3);
        Matcher groupMatcher3 = groupPatter3.matcher(htmlText);

        System.out.println(groupMatcher3.matches());

        groupMatcher3.reset();

        while (groupMatcher3.find()) {
            System.out.println("Occurrence: " + groupMatcher3.group(1));
        }

        System.out.println();

        String h2TextGroups = "(<h2>)(.+?)(</h2>)";

        Pattern h2TextPattern = Pattern.compile(h2TextGroups);
        Matcher h2TextMatcher = h2TextPattern.matcher(htmlText);

        while (h2TextMatcher.find()) {
            System.out.println("Occurrence: " + h2TextMatcher.group(2));
        }

        System.out.println();

        // US Number System //

        String us1 = "123456890";
        String us2 = "(123) 456-7890";
        String us3 = "123 456-7890";
        String us4 = "(123)456-7890";

        System.out.println("Phone Number 1 = " + us1.matches("^([\\(][0-9]{3}[\\)][ ][0-9]{3}[\\-][0-9]{4})$"));
        System.out.println("Phone Number 2 = " + us2.matches("^([\\(][0-9]{3}[\\)][ ][0-9]{3}[\\-][0-9]{4})$"));
        System.out.println("Phone Number 3 = " + us3.matches("^([\\(][0-9]{3}[\\)][ ][0-9]{3}[\\-][0-9]{4})$"));
        System.out.println("Phone Number 4 = " + us4.matches("^([\\(][0-9]{3}[\\)][ ][0-9]{3}[\\-][0-9]{4})$"));

        System.out.println();

        // India Number System //

        String india1 = "9824194-343";
        String india2 = "(9140823850)";
        String india3 = "7304159510";
        String india4 = "84210 48120";

        System.out.println("Phone Number 1 = " + india1.matches("^([0-9]{10})$"));
        System.out.println("Phone Number 2 = " + india2.matches("^([0-9]{10})$"));
        System.out.println("Phone Number 3 = " + india3.matches("^([0-9]{10})$"));
        System.out.println("Phone Number 4 = " + india4.matches("^([0-9]{10})$"));
    }
}
