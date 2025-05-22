package dsaAssg;

import java.util.Arrays;

public class InsertionSortExample {

    public static void insertionSort(int[] arr) {
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key; 
            System.out.println(Arrays.toString(arr));
        }
    }

    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};

        System.out.println("Original array:" +Arrays.toString(arr));
        System.out.println();

        insertionSort(arr);
        System.out.println();
        System.out.println("Sorted array using Insertion Sort:" +Arrays.toString(arr));
       
    }
}

