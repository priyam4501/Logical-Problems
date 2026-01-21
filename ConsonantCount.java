public class ConsonantCount{
    public static int consonantCount(String str){
        int count = 0;

        String check = str.toLowerCase();

        for(int i = 0; i < check.length(); i++){
            char ch = check.charAt(i);

            if(ch >= 'a' && ch <= 'z' && !"aeiou".contains(ch+"")){
                count++;
            }           
        }

        return count;
    }

    public static void main(String [] args){
        String str = "helloworld";

        System.out.println("Total consonants = " + consonantCount(str));
    }
}