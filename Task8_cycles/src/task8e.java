import java.util.Random;

public class task8e {
    public static void main(String[] args) {
        double primary = 1000;
        Random random = new Random();
        double P = random.nextDouble(26);
        System.out.println("Your interest rate = "+P+" %");
        int K = 0;

        while (primary < 1100) {
            K++;
            primary = primary * (1+P/100);
        }
        System.out.println("The quantity of month: "+K);
        System.out.println("The final sum: "+primary);
    }
}
