import java.util.Scanner;

public class Ex7e {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int N = scanner.nextInt();
        int reverse = 0;
        int n = N;
        int number = N;



        // reverse number
        for (;N > 0;N = N/10) {
            int remainder = N % 10;
            reverse = reverse * 10;
            reverse = reverse + remainder;
        }
        System.out.println("Reverse number = "+reverse);

        // the presence of 2
        for (;n > 0;n = n/10) {
            if (n % 10 == 2) {
                System.out.println("The number contains 2");
                break;
            } else if (n < 9) {
                System.out.println("The number does not contain 2");
            }
            }

        //quantity and sum
        int sum = 0;
        int quantity = 0;

        for (;number > 0;number = number/10) {
            int remainder = number % 10;
            sum = sum + remainder;
            quantity = quantity + 1;
        }
        System.out.println("The sum of digits = "+sum);
        System.out.println("The quantity of digits = "+quantity);
        }
    }
