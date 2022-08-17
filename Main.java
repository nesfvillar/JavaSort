import java.util.Random;

class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int[] arr = createRandomArray(10, 100, random);
        CountingSort.sort(arr);
        showArray(arr);
    }

    private static int[] createRandomArray(int n, int maxVal, Random random) {
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(maxVal);
        }
        return arr;
    }

    private static void showArray(int[] array) {
        for (int element : array) {
            System.out.print(element + " ");
        }
    }
}
