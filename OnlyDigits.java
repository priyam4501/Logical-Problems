class OnlyDigits {
    static boolean isOnlyDigits(String s) {
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch < '0' || ch > '9')
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isOnlyDigits("123456"));
        System.out.println(isOnlyDigits("12A45"));
    }
}
