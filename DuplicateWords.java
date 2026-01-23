class DuplicateWords {
    static void printDuplicates(String s) {
        String[] words = s.toLowerCase().split("\\s+");

        for (int i = 0; i < words.length; i++) {
            int count = 1;
            if (words[i].equals("0")) continue;

            for (int j = i + 1; j < words.length; j++) {
                if (words[i].equals(words[j])) {
                    count++;
                    words[j] = "0";
                }
            }
            if (count > 1)
                System.out.println(words[i]);
        }
    }

    public static void main(String[] args) {
        printDuplicates("Java is Java and Java is Powerful");
    }
}
