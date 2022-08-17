public class QuickSort extends Sort {
    public static void sort(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        quicksort(arr, start, end);
    }

    private static void quicksort(int[] arr, int start, int end) {
        if (end <= start)
            return;

        int i = partition(arr, start, end);
        quicksort(arr, start, i - 1);
        quicksort(arr, i + 1, end);
    }

    private static int partition(int[] arr, int start, int end) {
        int pivot = arr[end];
        int i = start;

        for (int j = i; j < end; j++) {
            if (arr[j] < pivot) {
                swap(arr, i, j);
                i++;
            }
        }

        swap(arr, i, end);
        return i;
    }
}
