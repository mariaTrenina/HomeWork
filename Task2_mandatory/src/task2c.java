import java.util.Random;

public class task2c {
    public static void main(String[] args) {
        Random random = new Random();
        int n = random.nextInt(10) + 1;

        //if-else
        if (n==1) {
            System.out.println(n);
            System.out.println("Monday");
        } else if (n==2) {
            System.out.println(n);
            System.out.println("Tuesday");
        } else if (n==3) {
            System.out.println(n);
            System.out.println("Wednesday");
        } else if (n==4) {
            System.out.println(n);
            System.out.println("Thursday");
        } else if (n==5) {
            System.out.println(n);
            System.out.println("Friday");
        } else if (n==6) {
            System.out.println(n);
            System.out.println("Saturday");
        } else if (n==7) {
            System.out.println(n);
            System.out.println("Sunday");
        } else {
            System.out.println(n);
            System.out.println("No day with this number");
        }

        //switch
        switch (n) {
            case 1:
                System.out.println(n);
                System.out.println("Monday");
                break;
            case 2:
                System.out.println(n);
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println(n);
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println(n);
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println(n);
                System.out.println("Friday");
                break;
            case 6:
                System.out.println(n);
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println(n);
                System.out.println("Sunday");
                break;
            default:
                System.out.println(n);
                System.out.println("No day with this number");
        }
    }
}
