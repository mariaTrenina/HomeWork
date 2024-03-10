import java.nio.file.Path;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExceptionPractice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your fio ");
        String enteredFio = scanner.nextLine();
        String regex = "[\\p{P}]";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(enteredFio);

        System.out.println("Enter your age");
        int enteredAge = scanner.nextInt();

        try {

            if (enteredFio.length() > 200) {
                throw new IncorrectInfoException("The length of your fio is too long", enteredFio,enteredAge);
            } else if (matcher.find()) {
                throw new IncorrectInfoException("The string contains incorrect symbols", enteredFio, enteredAge);
            }
        }
        catch (IncorrectInfoException ex) {
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        }

        try {
            if (enteredAge > 100 || enteredAge <0) {
                throw new IncorrectInfoException("Your age is incorrect", enteredFio,enteredAge);
            }
        }
        catch (IncorrectInfoException exception) {
            System.out.println(exception.getMessage());
            exception.printStackTrace();
        }


    }
}
