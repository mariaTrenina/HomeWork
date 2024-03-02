import java.util.Random;

public class task3c {
    public static void main(String[] args) {
        Random random = new Random();

        int a = random.nextInt(1001);
        int b = random.nextInt(1001);
        int c = random.nextInt(1001);
        System.out.println(a+", "+b+", "+c);

        if (b>a && c>a) {
            System.out.println(b+c);
        } else if (a>b && c>b) {
            System.out.println(a+c);
        } else {
            System.out.println(a+b);
        }
    }
}
