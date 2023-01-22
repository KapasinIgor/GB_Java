package Seminar_1;

// Task2
// Реализуйте алгоритм сортировки пузырьком для сортировки массива

import java.util.Arrays;

public class task_02 {
    public static void main(String[] args) {
        int[] arr = createArray();
        printArray(arr);
        sortArray(arr);
        printArray(arr);
    }

    static int[] createArray() {
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = ((int) (Math.random() * 300));
        }
        return arr;
    }

    static void sortArray(int[] array) {
        boolean isSorted = false;
        while(!isSorted) {
            isSorted = true;
            for (int i = 1; i < array.length; i++) {
                if (array[i] > array[i - 1]) {
                    int temp = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = temp;
                    isSorted = false;
                }
            }
        }
    }

    static void printArray(int[] array) {
        System.out.println(Arrays.toString(array));
    }
}
