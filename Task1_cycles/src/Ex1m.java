import java.util.Scanner;

public class Ex1m {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int amount = scanner.nextInt();
        int x = 1;
        while (x <= amount) {
            System.out.print("Task"+x+". ");
            x++;
        }
    }
}
