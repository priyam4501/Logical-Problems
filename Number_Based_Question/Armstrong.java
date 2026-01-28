package Number_Based_Question;

class Armstrong {

    static boolean isArmstrong(int num) {
        int temp = num, sum = 0;

        while (temp > 0) {
            int d = temp % 10;
            sum += d * d * d;
            temp /= 10;
        }
        return sum == num;
    }

    public static void main(String[] args) {
        System.out.println(isArmstrong(153));
    }
}

