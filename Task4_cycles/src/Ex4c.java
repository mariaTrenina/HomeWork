import java.util.Scanner;

public class Ex4c {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a");
        int a = scanner.nextInt();
        System.out.println("Enter b, knowing that b > a");
        int b = scanner.nextInt();
        int N = 0;

        for (int i = b-1; i > a; i--) {
            N = N + 1;
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("Total amount of numbers: "+N);
    }
}
