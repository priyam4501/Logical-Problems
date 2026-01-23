class FirstNonRepeating {
    static char findFirst(String s) {
        for (int i = 0; i < s.length(); i++) {
            boolean unique = true;
            for (int j = 0; j < s.length(); j++) {
                if (i != j && s.charAt(i) == s.charAt(j)) {
                    unique = false;
                    break;
                }
            }
            if (unique) return s.charAt(i);
        }
        return '\0';
    }

    public static void main(String[] args) {
        System.out.println(findFirst("swiss"));
    }
}
