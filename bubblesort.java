public class BubbleSort extends Sort {
    public static void sort(int[] arr) {
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
}