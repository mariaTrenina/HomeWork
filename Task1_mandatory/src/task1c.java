import java.util.Random;

public class task1c {
    public static void main(String[] args) {

        Random random = new Random();
        int n = random.nextInt(1001);
        int remainder = n % 2;

        //if-else
        if (remainder == 0) {
            System.out.println(n);
            System.out.println("Number is even");
        } else {
            System.out.println(n);
            System.out.println("Number is odd");
        }


        //switch
        switch (remainder) {
            case 0:
                System.out.println(n);
                System.out.println("Number is even");
                break;
            default:
                System.out.println(n);
                System.out.println("Number is odd");
        }

    }
}
