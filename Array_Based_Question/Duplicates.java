package Array_Based_Question;

class Duplicates {

    static void printDuplicates(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println(arr[i]);
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 1};
        printDuplicates(arr);
    }
}

