class Program {
    public static void main(String args[]) {
        int[] arr = {2, 1, 7, 4, 0, 8, 2, 9};
        QuickSort.quicksort(arr);
        for (int element : arr) {
            System.out.print(element);
        }
    }
}

class QuickSort {
    public static void quicksort(int[] arr) {
        int start = 0;
        int end = arr.length-1;
        quicksort(arr, start, end);
    }

    private static void quicksort(int[] arr, int start, int end) {
        if (end <= start) return;

        int i = partition(arr, start, end);
        quicksort(arr, start, i - 1);
        quicksort(arr, i + 1, end);
    }

    private static int partition(int[]arr, int start, int end) {
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

    private static void swap(int[] arr, int i, int j) {
        if (i == j) return;

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

