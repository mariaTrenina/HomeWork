import java.util.Random;

public class task6e {
    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(1000);
        System.out.println(number);
        int remainder = number % 2;

        if (number >= 0 && number <= 9) {
            if (remainder == 0) {
                System.out.println("Число однозначное четное");
            } else {
                System.out.println("Число однозначное нечетное");
            }
        } else {
            if (number >= 10 && number < 99) {
                if (remainder == 0) {
                    System.out.println("Число двузначное четное");
                } else {
                    System.out.println("Число двузначное нечетное");
                }
            } else {
                if (remainder == 0) {
                    System.out.println("Число трехзначное четное");
                } else {
                    System.out.println("Число трехзначное нечетное");
                }
            }
        }
    }
}