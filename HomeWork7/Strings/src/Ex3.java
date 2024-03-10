import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex3 {
    public static void main(String[] args) {
        String input = "ahb acb aeb aeeb adcb axeb";
        Pattern pattern = Pattern.compile("a.{1}b");
        Matcher matcher = pattern.matcher(input);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
