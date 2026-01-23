class StringCompression {
    static String compress(String s) {
        String result = "";
        int count = 1;

        for (int i = 1; i <= s.length(); i++) {
            if (i < s.length() && s.charAt(i) == s.charAt(i - 1))
                count++;
            else {
                result = result + s.charAt(i - 1) + count;
                count = 1;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(compress("aabcccccaaa"));
    }
}
