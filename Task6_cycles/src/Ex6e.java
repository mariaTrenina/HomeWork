import java.util.Random;

public class Ex6e {
    public static void main(String[] args) {
        Random random = new Random();
        int A = random.nextInt(20)+1;
        System.out.print(A+" ");
        int B = random.nextInt(20)+1;
        System.out.println(B+" ");
        int C = random.nextInt(10)+1;
        System.out.print(C);
        int amountB = 0;
        int amountA = 0;


        for (int i = 0;C*i < B;i++) {
            amountB = i;
        }
        for (int j = 0;C*j < A;j++) {
            amountA = j;
        }

        int total = amountA * amountB;
        System.out.println();
        System.out.println("Количество квадратов: "+total);

    }
}
