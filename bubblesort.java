class Program {
    public static void main(String args[]) {
        int[] arr = {2, 1, 7, 4, 0, 8, 2, 9};
        BubbleSort.bubblesort(arr);
        for (int element : arr) {
            System.out.print(element);
        }
    }
}

class BubbleSort {
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