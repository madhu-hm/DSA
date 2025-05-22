package dsaAssg;

import java.util.Arrays;

public class SelectionSortExample {

    public static void selectionSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j; 
                }
            }

            if (minIndex != i) {
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
            System.out.println(Arrays.toString(arr));
        }
    }


    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};

        System.out.println("Original array:" +Arrays.toString(arr));
        System.out.println();

        selectionSort(arr);

        System.out.println();
        System.out.println("Sorted array using Selection Sort:" +Arrays.toString(arr));
    }
}

