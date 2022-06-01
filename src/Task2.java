import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        int []array = {4, 5, 6, 7, 1};
        int min = 0;
        int max = 0;
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
             if (i == 0) {
                 min = array[i];
                 max = array[i];
             }
             if (min > array[i]) {
                 min = array[i];
             }
                 if (max < array[i]) {
                     max = array[i];
             }
                 sum += array[i];

        }
        sum = sum / array.length;
    //    System.out.println(sum);
             int q = 0;
        for (int i = 0; i < array.length; i++) {
            for(int j = 0; j < array.length; j++) {
                if (array[i] < array[j]) {
                    q = array[i];
                    array[i] = array[j];
                    array[j] = q;

                }
            }
            System.out.println(Arrays.toString(array));
        }
    }
}
