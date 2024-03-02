import java.util.Scanner;

public class Ex1s {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the line");
        String str = scanner.nextLine();
        System.out.println("Enter the desired symbol");
        char c = scanner.next().charAt(0);
        int x = 0;

        char[] array = str.toCharArray();
        for (int i = 0; i < array.length; i++) {
            if (array[i] == c) {
                x ++;
            }
        }
        System.out.println("Your string: "+ str);
        System.out.println("Your symbol: " + c);
        System.out.println("Number of repeats: " + x);
    }
}
