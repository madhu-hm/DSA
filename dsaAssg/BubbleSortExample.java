package dsaAssg;

import java.util.Arrays;

public class BubbleSortExample {

    public static void bubbleSort(int[] arr) {
    	 int n = arr.length;
    	 for(int i=0; i<n-1; i++) {
    		 for(int j=1; j<n-i; j++) {
    			 if(arr[j-1]>arr[j]) {
    				 int temp = arr[j];
    				 arr[j] = arr[j-1];
    				 arr[j-1]  = temp;
    			 }
    		 }
    		 System.out.println(Arrays.toString(arr));
    	 }
    }

    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};
        
        System.out.println("Original array:" +Arrays.toString(arr));
        
        bubbleSort(arr);

        System.out.println("Sorted array using Bubble Sort:" +Arrays.toString(arr));
    }
}
