import java.util.Arrays;
import java.util.Scanner;
//import org.apache.commons.lang3.ArrayUtils

public class java2 {
    public static void main(String[] args) {
        // int[] array = {2, 3, 4, 5, 6, 7};

        //for (int i : array) {
        // System.out.println(i);

        //int [] numbers1 = {1,2,3};
        //int sum = 0;
        //for (int x:numbers1) {
        //   sum = sum+x;
        /*1.)
        Scanner sc = new Scanner(System.in);
        int value = sc.nextInt();

        int[] array = {2, 3, 4, 5, 6, 7};
        for(int x: array) {
            if (x == value) {
                System.out.print(value);
            } */

        /* int count = 0 ;

        for (int x : array) {
            if (x == eD) {
                count++;
            }
        }
        int [] array2 = new int [array.length - count];
    } */

        int[] array = {4, 5, 6};
        //int [] newArray = null;
        Scanner sc = new Scanner(System.in);
        int eD = sc.nextInt();
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == eD) {
                // int a = array[i];
                array[i] = 0;
                count++;
            }
        }
        int n = array.length - count;
        int[] array2 = new int[n];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0) { // array[i] - 4islo v array pod index i
                array2[index] = array[i]; // Второму массиву под индексом index присваиваем ячейку первого массива под индексом i.
                index++;
            }
        }
        if (count == 0) {
            System.out.println("Takogo 4isla net");
        } else {
            System.out.println(Arrays.toString(array2));
        }
    }
}      /* int [] array = {7, 2, 3, 4, 5,};

        boolean isSorted = false;
        int number;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < array.length-1; i++) {
                if(array[i] > array[i+1]){
                    isSorted = false;

                    number = array[i];
                    array[i] = array[i+1];
                    array[i+1] = number;
                }
            }
        }
        System.out.println(Arrays.toString(array)); */
        /* int[] array = {7, 2, 3, 4, 5,};
        for (int i = array.length - 1; i > 0; i--) {
            for (int n = 0; n > i; n++) {
                if (array[n] > array[n + 1]) {
                    int p = array[n];
                    array[n] = array[n + 1];
                    array[n + 1] = p;
                }
                System.out.print(Arrays.toString(array));
            }
        }
    }
} */












