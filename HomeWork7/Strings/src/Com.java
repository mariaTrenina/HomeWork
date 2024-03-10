import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Com {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter some text");
        String str = scanner.nextLine();

        Pattern pattern = Pattern.compile("^\\w+\\.com$");
        Matcher matcher = pattern.matcher(str);
        System.out.println(matcher.matches());

    }
}
