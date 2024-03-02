import java.util.Random;
import java.util.Scanner;

public class Ex4a {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the array size");
        int n = scanner.nextInt();
        System.out.println("Enter the lower range of the array");
        int min = scanner.nextInt();
        System.out.println("Enter the upper range of the array");
        int max = scanner.nextInt();

        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            Random random = new Random();
            array[i] = random.nextInt(max + 1 - min) + min;
        }
        for (int a : array) {
            System.out.print(a + " ");
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        System.out.println();
        for (int x : array) {
            System.out.print(x + " ");

        }
    }
}