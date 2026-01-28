package Array_Based_Question;

class SecondLargest {

    static int getSecondLargest(int[] arr) {
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int n : arr) {
            if (n > first) {
                second = first;
                first = n;
            } else if (n > second && n != first) {
                second = n;
            }
        }
        return second;
    }

    public static void main(String[] args) {
        int[] arr = {10, 45, 2, 89, 34};
        System.out.println(getSecondLargest(arr));
    }
}

