import java.util.Random;

public class Ex1a {
    public static void main(String[] args) {
        int[] array = new int[4];
        boolean status = true;

        for (int i = 0; i < array.length; i++) {
            Random random = new Random();
            array[i] = random.nextInt(90)+10;
        }

        for (int a:array) {
            System.out.print(a+" ");
        }

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] <= array[i+1]) {
                status = true;
            } else {
                status = false;
                break;
            }
        }
        System.out.println();
        if (status == true) {
            System.out.println("The array is a strictly increasing sequence");
        }
    }
}
