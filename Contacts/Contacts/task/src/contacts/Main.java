package contacts;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String text = "We use Java to write modern applications";
        Pattern pattern = Pattern.compile("\\b.*mode.*", Pattern.CASE_INSENSITIVE);  // Regex to match Java or java
        Pattern pattern2 = Pattern.compile("\\B.*mode.*", Pattern.CASE_INSENSITIVE);  // Regex to match Java or java
        Matcher matcher = pattern.matcher(text);
        Matcher matcher2 = pattern2.matcher(text);

        boolean matches = matcher.matches();
        boolean matches2 = matcher2.matches();

        System.out.println(matches);
        System.out.println(matches2);
    }
}
