package Array_Based_Question;

public class FrequencyArray {
    static void printFrequency(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == -1) continue;

            int count = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    arr[j] = -1;
                }
            }
            System.out.println(arr[i] + " -> " + count);
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 1};
        printFrequency(arr);
    }
}
