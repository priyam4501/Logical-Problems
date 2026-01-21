public class PunctuationCount{

    public static int punctuationCount(String str){
        int count = 0;

        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);

            if (ch == '!' || ch == ',' || ch == '.' || ch == '?' || ch == ';' || ch == ':' || ch == '\'') {
                count++;
            }
        }
        
        return count; 
    }

    public static void main(String[] args){
        String str = "Hello world! How are you?"; 

        System.out.println("Punctuation Count = " + punctuationCount(str)); 
    }
}