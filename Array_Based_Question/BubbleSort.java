package Array_Based_Question;

class BubbleSort {

    static void sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int t = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = t;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 1, 4, 2, 8};
        sort(arr);

        for (int n : arr)
            System.out.print(n + " ");
    }
}

