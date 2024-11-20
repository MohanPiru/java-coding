class QuickSort {
    // QuickSort function
    public void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(arr, low, high); // Partition the array
            quickSort(arr, low, pivotIndex - 1);        // Sort left subarray
            quickSort(arr, pivotIndex + 1, high);       // Sort right subarray
        }
    }

    // Partition function using two while loops
    private int partition(int[] arr, int low, int high) {
        int pivot = arr[low]; // Take the first element as the pivot
        int left = low;
        int right = high;

        while (left < right) {
            // Move right pointer leftward to find an element smaller than the pivot
            while (left < right && arr[right] >= pivot) {
                right--;
            }

            // Move left pointer rightward to find an element greater than the pivot
            while (left < right && arr[left] <= pivot) {
                left++;
            }

            // Swap elements at left and right pointers
            if (left < right) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
            }
        }

        // Place the pivot element in its correct position
        arr[low] = arr[left];
        arr[left] = pivot;

        return left; // Return the pivot's index
    }

    // Main method to test the QuickSort algorithm
    public static void main(String[] args) {
        QuickSort qs = new QuickSort();
        int[] arr = {8, 4, 7, 3, 10, 2, 1, 9};
        System.out.println("Original Array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        qs.quickSort(arr, 0, arr.length - 1);

        System.out.println("\nSorted Array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
