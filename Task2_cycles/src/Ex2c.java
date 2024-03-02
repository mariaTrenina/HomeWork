public class Ex2c {
    public static void main(String[] args) {
        int counter = 100;


        do {
            int remainder = counter % 5;
            if (remainder == 0) {
                System.out.print(counter+" ");
            }
            counter--;
        } while (counter > 0);



    }
}
