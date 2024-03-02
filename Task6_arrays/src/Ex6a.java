import java.util.Random;
import java.util.Scanner;

public class Ex6a {
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
            array[i] = random.nextInt(max+1-min)+min;
        }
        for (int a: array) {
            System.out.print(a+" ");
        }

        System.out.println();
        for (int i = 0; i < array.length/2; i++) {
            int temp = array[i];
            array[i] = array[array.length-i-1];
            array[array.length-i-1] = temp;
        }
        for (int a: array) {
            System.out.print(a+" ");
        }
    }
}
