class RotationCheck {
    static boolean isRotation(String s1, String s2) {
        if (s1.length() != s2.length())
            return false;

        String combined = s1 + s1;

        for (int i = 0; i <= combined.length() - s2.length(); i++) {
            int j;
            for (j = 0; j < s2.length(); j++) {
                if (combined.charAt(i + j) != s2.charAt(j))
                    break;
            }
            if (j == s2.length())
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isRotation("ABCD", "CDAB")); // true
        System.out.println(isRotation("ABCD", "ACBD")); // false
    }
}
