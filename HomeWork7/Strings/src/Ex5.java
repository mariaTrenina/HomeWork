import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Date date;
        System.out.println("Enter the date in format 'dd.MM.yyyy'");
        String inputDate = scanner.next();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
        try {
            date = dateFormat.parse(inputDate);
            System.out.println("Your entered date: "+dateFormat.format(date));
        } catch (ParseException e) {
            System.out.println("Something went wrong. Make sure you entered the date in the correct format");
        }

        Pattern pattern = Pattern.compile("^(0[1-9]|[12][0-9]|30).(0[1-9]|1[0-2]).(1[0-9]{3}|20(0[0-9]|1[0-2]))$");
        Matcher matcher = pattern.matcher(inputDate);
        if (matcher.matches()) {
            System.out.println("Such a date exists");
        } else {
            System.out.println("Such a date does not exists");
        }

    }
}
