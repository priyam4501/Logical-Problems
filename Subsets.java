class Subsets {

    static void printSubsets(String s) {
        int n = s.length();

        for (int i = 0; i < n; i++) {
            String temp = "";
            for (int j = i; j < n; j++) {
                temp = temp + s.charAt(j);
                System.out.println(temp);
            }
        }
    }

    public static void main(String[] args) {
        String s = "FUN";
        printSubsets(s);
    }
}
