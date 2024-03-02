import java.util.Random;
import java.util.Scanner;

public class task5e {
    public static void main(String[] args) {
        Random random = new Random();
        int action = random.nextInt(4)+1;
        System.out.println(action);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number");
        double a = scanner.nextDouble();
        System.out.println("Enter the second number");
        double b = scanner.nextDouble();

        switch (action) {
            case 1:
                System.out.println(a+b);
                break;
            case 2:
                System.out.println(a-b);
                break;
            case 3:
                System.out.println(a*b);
                break;
            case 4:
                System.out.println(a/b);
                break;
        }
    }
}
