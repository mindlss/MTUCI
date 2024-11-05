import java.util.regex.*;

public class CapitalAfterLowercase {
    public static void main(String[] args) {
        String text = "этО приМер теКсТа с aA комбиНациями.";
        Pattern pattern = Pattern.compile("(?<=[a-яa-z])([A-ZА-Я])");
        Matcher matcher = pattern.matcher(text);

        String result = matcher.replaceAll("|$1|");
        System.out.println(result);
    }
}
