class ReverseWords {
    static String reverseWords(String s) {
        String[] words = s.split("\\s+");
        String result = "";

        for (int i = words.length - 1; i >= 0; i--) {
            result = result + words[i];
            if (i != 0) result = result + " ";
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(reverseWords("I Love Programming"));
    }
}
