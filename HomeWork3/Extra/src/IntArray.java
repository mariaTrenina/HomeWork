import java.lang.reflect.Array;
import java.util.Arrays;

public class IntArray {
    private int[] array;
    IntArray(int n) {
        array = new int[n];
    }
    IntArray(int ... numbers) {
        for (int i = 0; i < numbers.length; i++) {
            array = numbers;
        }
    }
    IntArray() {
        array = new int[10];
    }

    //method
    public void sort(boolean state) {
        if (state) {
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array.length - i - 1; j++) {
                    if (array[j] > array[j+1]) {
                        int temp = array[j];
                        array[j] = array[j+1];
                        array[j+1] = temp;
                    }
                }
            }
        } else {
            int iMin;
            for (int i = array.length-1; i >= 0; i--) {
                iMin = i;
                for (int j = i; j >= 0; j--) {
                    if (array[j] < array[iMin]) {
                        iMin = j;
                    }
                }
                if (iMin != i) {
                    int temp = array[iMin];
                    array[iMin] = array[i];
                    array[i] = temp;
                }
            }
        }
        for (int x: array) {
            System.out.print(x + " ");
        }
    }

    public String getArray() {
        return Arrays.toString(array);
    }

    public void setArray(int ... numbers) {
        for (int i = 0; i < numbers.length; i++) {
            array = numbers;
        }
    }
}

