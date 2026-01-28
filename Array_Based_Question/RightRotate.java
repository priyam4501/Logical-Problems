package Array_Based_Question;

class RightRotate {

    static void rotateRight(int[] arr, int times) {
        for (int i = 0; i < times; i++) {
            int last = arr[arr.length - 1];
            for (int j = arr.length - 1; j > 0; j--)
                arr[j] = arr[j - 1];
            arr[0] = last;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        rotateRight(arr, 2);

        for (int n : arr)
            System.out.print(n + " ");
    }
}

