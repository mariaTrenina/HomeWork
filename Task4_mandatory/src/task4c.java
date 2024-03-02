import java.util.Random;

public class task4c {
    public static void main(String[] args) {
        Random random = new Random();
        int year = random.nextInt(2201)+800;
        System.out.println(year);

        int four = year % 4;
        int hundred = year % 100;
        int fhundred = year % 400;

        if (four == 0) {
            if (hundred == 0) {
                if (fhundred == 0) {
                    System.out.println("There are 366 days in this year");
                } else {
                    System.out.println("There are 365 days in this year");
                }
            } else {
                System.out.println("There are 366 days in this year");
            }
        } else {
            System.out.println("There are 365 days in this year");
        }
    }
}
