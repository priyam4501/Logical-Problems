package Array_Based_Question;

class LeftRotate {

    static void rotateLeft(int[] arr, int times) {
        for (int i = 0; i < times; i++) {
            int first = arr[0];
            for (int j = 0; j < arr.length - 1; j++)
                arr[j] = arr[j + 1];
            arr[arr.length - 1] = first;
        }
    }

    static void printArray(int[] arr) {
        for (int n : arr)
            System.out.print(n + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        rotateLeft(arr, 2);
        printArray(arr);
    }
}

