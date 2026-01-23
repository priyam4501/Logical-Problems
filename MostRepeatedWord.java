import java.io.*;

class MostRepeatedWord {
    static String getMostRepeated(String path) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader(path));
        String text = "", line;

        while ((line = br.readLine()) != null)
            text = text + line + " ";

        br.close();

        String[] words = text.toLowerCase().split("\\W+");
        String maxWord = "";
        int maxCount = 0;

        for (int i = 0; i < words.length; i++) {
            int count = 1;
            for (int j = i + 1; j < words.length; j++) {
                if (words[i].equals(words[j]))
                    count++;
            }
            if (count > maxCount) {
                maxCount = count;
                maxWord = words[i];
            }
        }
        return maxWord;
    }

    public static void main(String[] args) throws Exception {
        System.out.println(getMostRepeated("data.txt"));
    }
}
