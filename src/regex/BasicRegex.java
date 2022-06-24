package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BasicRegex {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("a");
        Matcher matcher = pattern.matcher("hello my name is bilal");

        System.out.println(matcher.matches());

        while(matcher.find()){ //find the next present matched pattern in given string
            System.out.println(matcher.group());
            System.out.println(matcher.start());
        }

        System.out.println(Pattern.matches("a", "bilal"));

        System.out.println(Pattern.matches("\\([0-9]{3}\\)-[0-9]{3}-[0-9]{4}", "(815)-456-1234"));

        String str = " abc 123 &$# ";
        str.replaceAll("[\\s]", "");
        str= str.replaceAll("[^a-zA-Z0-9]", "");
        System.out.println(str);








    }
}
