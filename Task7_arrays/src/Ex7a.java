import java.util.Random;
import java.util.Scanner;

public class Ex7a {
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

        //sort
        int iMax;
        for (int i = array.length-1; i>=0; i--) {
            iMax = i;
            for (int j = i; j >= 0; j--) {
                if (array[j] > array[iMax]) {
                    iMax = j;
                }
            }
            if (iMax != i) {
                int temp = array[iMax];
                array[iMax] = array[i];
                array[i] = temp;
            }
        }
        System.out.println();
        for (int a: array) {
            System.out.print(a+" ");
        }

        System.out.println();
        System.out.println("Enter the desired value");
        int value = scanner.nextInt();
        int linearSteps = 0;
        int elementIndex = -1;

        //linear search
        for (int i = 0; i < array.length; i++) {
            linearSteps ++;
            if (array[i] == value) {
                elementIndex = i;
                break;
            }
        }
        System.out.println("Element index " + elementIndex);
        System.out.println("Linear search: "+linearSteps+" steps");

        //binary search
        int binarySteps = 0;
        int lowIndex = 0;
        int highIndex = array.length-1;
        while (lowIndex <= highIndex) {
            binarySteps ++;
            int midIndex = (lowIndex + highIndex) / 2;
            if (value == array[midIndex]) {
                elementIndex = midIndex;
                break;
            } else if (value < array[midIndex]) {
                highIndex = midIndex-1;
            } else {
                lowIndex = midIndex;
            }
        }
        System.out.println("Binary search: "+binarySteps+" steps");
    }
}
