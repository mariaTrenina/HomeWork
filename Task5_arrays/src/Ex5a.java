import java.util.Random;
import java.util.Scanner;

public class Ex5a {
    public static void main(String[] args) {
        int[] array = new int[20];
        for (int i = 0; i < array.length; i++) {
            Random random = new Random();
            array[i] = random.nextInt(101);
        }
        for (int a: array) {
            System.out.print(a + " ");
        }

        System.out.println();
        boolean presence = false;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = scanner.nextInt();
        int index = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == n) {
                index = i;
                presence = true;
                break;
            }
        }
        if (presence == true) {
            System.out.println("Index of the entered number: "+index);
        } else {
            System.out.println("The entered number is not in the array");
        }
}
}
