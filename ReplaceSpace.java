class ReplaceSpace {

    static String replaceSpaces(String s, char ch) {
        String result = "";

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ')
                result += ch;
            else
                result += s.charAt(i);
        }
        return result;
    }

    public static void main(String[] args) {
        String s = "Java is fun";
        System.out.println(replaceSpaces(s, '-'));
    }
}
