public class BubbleSort {
    public static void bubblesort(int[] arr) {
        boolean finished = false;

        while (!finished) {
            finished = true;
            for (int i = 0; i < arr.length - 1; i++) {
                int j = i + 1;
                if (arr[i] > arr[j]) {
                    finished = false;
                    swap(arr, i, j);
                }
            }
        }
    }

    private static void swap(int[] arr, int i, int j) {
        if (i == j) return;

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}