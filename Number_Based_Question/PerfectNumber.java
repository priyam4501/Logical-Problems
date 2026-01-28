package Number_Based_Question;

class PerfectNumber {

    static boolean isPerfect(int num) {
        int sum = 0;
        for (int i = 1; i < num; i++)
            if (num % i == 0)
                sum += i;

        return sum == num;
    }

    public static void main(String[] args) {
        System.out.println(isPerfect(28));
    }
}

