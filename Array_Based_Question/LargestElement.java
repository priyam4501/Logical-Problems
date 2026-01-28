package Array_Based_Question;

class LargestElement {

    static int getLargest(int[] arr) {
        int max = arr[0];
        for (int n : arr)
            if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {10, 45, 2, 89, 34};
        System.out.println(getLargest(arr));
    }
}

