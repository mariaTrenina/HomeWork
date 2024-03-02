import java.util.Scanner;

public class Ex3c {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = scanner.nextInt();
        long factorial = 1L;

        for (int i = 1; i <= n  ; i++) {
            factorial = factorial * i;

        }
        System.out.println(n+"! = "+factorial);
    }



    }

