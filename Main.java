class Main {
    public static void main(String[] args) {
        int[] arr = { 2, 1, 7, 4, 0, 8, 2, 9 };
        CountingSort.countingsort(arr, 10);
        for (int element : arr) {
            System.out.print(element);
        }
    }
}
