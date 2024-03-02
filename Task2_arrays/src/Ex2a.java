import java.util.Random;
import java.util.Scanner;

public class Ex2a {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the array size");
        int run = scanner.nextInt();
        if (run <= 0) {
            System.out.println("The wrong number");
            System.out.println("Enter again (> 0)");
            run = scanner.nextInt();
        }

        System.out.println("Enter the lower range of the array");
        int lowEdge = scanner.nextInt();
        System.out.println("Enter the upper range of the array");
        int upperEdge = scanner.nextInt();
        if (upperEdge < lowEdge) {
            System.out.println("Wrong number! Enter the lower range of the array number");
            lowEdge = scanner.nextInt();
            System.out.println("Enter the upper range of the array again");
            upperEdge = scanner.nextInt();
        }

        int[] array = new int[run];
        for (int i = 0; i < array.length; i++) {
            Random random = new Random();
            array[i] = random.nextInt(upperEdge + 1 - lowEdge) + lowEdge;
        }

        for (int a: array) {
            System.out.print(a+" ");
        }
    }
}
