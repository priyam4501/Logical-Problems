public class VowelCount{
    public static int vowelCount(String str){
        int count = 0;
        String check = str.toLowerCase();

        for(int i = 0; i < check.length(); i++){
            char ch = check.charAt(i);
          
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ){
                count++;
            }  
        }

        return count;
    }

    public static void main(String [] args){
        String str = "helloworld";

        System.out.println("Total Number of Vowels = " + vowelCount(str));
    } 
}