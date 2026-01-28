package Array_Based_Question;

class DigitMinMax {

    static int getLargestDigit(int num) {
        int max = 0;
        while (num > 0) {
            int d = num % 10;
            if (d > max) max = d;
            num /= 10;
        }
        return max;
    }

    static int getSmallestDigit(int num) {
        int min = 9;
        while (num > 0) {
            int d = num % 10;
            if (d < min) min = d;
            num /= 10;
        }
        return min;
    }

    public static void main(String[] args) {
        int num = 58342;
        System.out.println("Largest: " + getLargestDigit(num));
        System.out.println("Smallest: " + getSmallestDigit(num));
    }
}

