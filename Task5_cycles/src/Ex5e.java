import java.util.Scanner;

public class Ex5e {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter A");
        int A = scanner.nextInt();
        System.out.println("Enter B, knowing that B < A");
        int B = scanner.nextInt();
        int X = 0;

        for (int i = 1; B * i < A; i++) {
            X = A - (B * i);
        }
        System.out.println(X);


    }
}
