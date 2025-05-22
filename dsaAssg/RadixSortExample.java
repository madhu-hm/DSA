package dsaAssg;

import java.util.Arrays;

public class RadixSortExample {

    public static void radixSort(int[] arr) {
  
    	int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max)
                max = arr[i];
        }
        for (int exp = 1; max / exp > 0; exp *= 10) {
            countSort(arr, exp);
            System.out.println(Arrays.toString(arr));
        }
    }

    public static void countSort(int[] arr, int exp) {
        int n = arr.length;
        int[] output = new int[n];
        int[] count = new int[10];
        
        for (int i = 0; i < n; i++) {
            int digit = (arr[i] / exp) % 10;
            count[digit]++;
        }

        for (int i = 1; i < 10; i++) {
            count[i] += count[i - 1];
        }

        for (int i = n - 1; i >= 0; i--) {
            int digit = (arr[i] / exp) % 10;
            output[count[digit] - 1] = arr[i];
            count[digit]--;
        }

        for (int i = 0; i < n; i++) {
            arr[i] = output[i];
        }
    }


    public static void main(String[] args) {
        int[] arr = {170, 45, 75, 90, 802, 24, 2, 66};

        System.out.println("Original array:" +Arrays.toString(arr));
        System.out.println();

        radixSort(arr);

        System.out.println();
        System.out.println("Sorted array using Radix Sort:" +Arrays.toString(arr));
     
    }
}

