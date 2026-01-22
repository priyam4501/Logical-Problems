class MaxMinChar {

    static void findMaxMin(String s) {
        int[] count = new int[256];

        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i)]++;
        }

        char maxChar = s.charAt(0), minChar = s.charAt(0);
        int max = count[maxChar], min = count[minChar];

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (count[c] > max) {
                max = count[c];
                maxChar = c;
            }
            if (count[c] < min && count[c] != 0) {
                min = count[c];
                minChar = c;
            }
        }

        System.out.println("Max Occurring Character: " + maxChar);
        System.out.println("Min Occurring Character: " + minChar);
    }

    public static void main(String[] args) {
        String s = "success";
        findMaxMin(s);
    }
}
