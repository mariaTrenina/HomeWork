import java.util.Random;

public class task8e {
    public static void main(String[] args) {
        Random random = new Random();

        int a = random.nextInt(9)+6;
        System.out.println("Достоинство карты: "+a);
        int b = random.nextInt(4)+1;
        System.out.println("Масть карты: "+b);

        switch (a) {
            case 6:
                System.out.print("Шестерка");
                break;
            case 7:
                System.out.print("Семерка");
                break;
            case 8:
                System.out.print("Восьмерка");
                break;
            case 9:
                System.out.print("Девятка");
                break;
            case 10:
                System.out.print("Десятка");
                break;
            case 11:
                System.out.print("Валет");
                break;
            case 12:
                System.out.print("Дама");
                break;
            case 13:
                System.out.print("Король");
                break;
            case 14:
                System.out.print("Туз");
                break;
        }

        switch (b) {
            case 1:
                System.out.print(" пик");
                break;
            case 2:
                System.out.print(" треф");
                break;
            case 3:
                System.out.print(" бубен");
                break;
            case 4:
                System.out.print(" червей");
                break;
        }
    }
}
