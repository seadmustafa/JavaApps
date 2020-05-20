import java.util.*;
 
public class SelectionSort {

    public static void main(String[] args) {
        // Write your code here
        int array[] = {64, 25, 12, 22, 11};
        System.out.println("Original array is : " + Arrays.toString(array));
        selectionSort(array);
        System.out.println("Sorted array is : " + Arrays.toString(array));
    }

    static void selectionSort(int array[]) {
 
        for (int i = 0; i < array.length - 1; i++) { 
            int min_index = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[min_index]) {
                    min_index = j;
                }
            }

            int temp = array[min_index];
            array[min_index] = array[i];
            array[i] = temp;

        }
    }

}
