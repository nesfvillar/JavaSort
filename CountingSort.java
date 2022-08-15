public class CountingSort {
    public static void countingsort(int[] arr, int max_k) {
        int[] counter = new int[max_k + 1];

        for (int i = 0; i < arr.length; i++) {
            int currentValue = arr[i];
            if (currentValue > max_k)
                return;
            counter[currentValue]++;
        }

        int k = 0;
        for (int i = 0; i < arr.length; i++) {
            while (counter[k] == 0)
                k++;
            counter[k]--;
            arr[i] = k;
        }
    }
}