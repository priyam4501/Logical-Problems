public class DivideString {
    public static void divideString(String str, int n) {
        int len = str.length();

        if (len % n != 0) {
            System.out.println("Cannot divide equally");
            return;
        }

        int part = len / n;
        for (int i = 0; i < len; i += part) {
            System.out.println(str.substring(i, i + part));
        }
    }

    public static void main(String [] args){
        String str = "abcdefgh";
        int n = 4;

        divideString(str,n);
    }
}
