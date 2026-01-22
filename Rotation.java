class Rotation {

    static boolean isRotation(String s1, String s2) {
        if (s1.length() != s2.length())
            return false;

        String temp = s1 + s1;

        for (int i = 0; i <= temp.length() - s2.length(); i++) {
            int j = 0;

            while (j < s2.length() && temp.charAt(i + j) == s2.charAt(j)) {
                j++;
            }

            if (j == s2.length())
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String s1 = "abcd";
        String s2 = "cdab";

        if (isRotation(s1, s2))
            System.out.println("Rotation");
        else
            System.out.println("Not Rotation");
    }
}
