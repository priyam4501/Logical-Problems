class LongestSubstring {
    static String longestUnique(String s) {
        String longest = "";

        for (int i = 0; i < s.length(); i++) {
            String current = "";

            for (int j = i; j < s.length(); j++) {
                if (current.indexOf(s.charAt(j)) != -1)
                    break;
                current = current + s.charAt(j);
            }

            if (current.length() > longest.length())
                longest = current;
        }
        return longest;
    }

    public static void main(String[] args) {
        System.out.println(longestUnique("abcabcbb"));
    }
}
