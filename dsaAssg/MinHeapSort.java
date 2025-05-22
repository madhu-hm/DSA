package dsaAssg;

public class MinHeapSort {

    public static void heapSort(int[] arr) {
        int n = arr.length;

        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(arr, n, i);

        for (int i = n - 1; i > 0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            heapify(arr, i, 0);
        }
    }

    static void heapify(int[] arr, int n, int i) {
        int smallest = i;      
        int left = 2 * i + 1;  
        int right = 2 * i + 2;  

        if (left < n && arr[left] < arr[smallest])
            smallest = left;

        if (right < n && arr[right] < arr[smallest])
            smallest = right;

        if (smallest != i) {
            int swap = arr[i];
            arr[i] = arr[smallest];
            arr[smallest] = swap;
            heapify(arr, n, smallest);
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 4, 1, 2};
        heapSort(arr);
        System.out.println("Sorted (Descending using Min Heap):");
        for (int num : arr)
            System.out.print(num + " ");
    }
}
