import java.util.Scanner;

public class Ex2s {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the line");
        String str = scanner.nextLine();
        if (str.equals("")) {
            System.out.println("The line is empty. Please, enter again");
            str = scanner.nextLine();
        }
        System.out.println("Enter the first desired symbol");
        char a = scanner.next().charAt(0);
        System.out.println("Enter the second desired symbol");
        char b = scanner.next().charAt(0);

        char[] array = str.toCharArray();
        for (int i = 0; i < array.length; i++) {
            if (array[i] == a) {
                array[i] = b;
            }
        }

        for (char x: array) {
            System.out.print(x);
        }
    }
}
