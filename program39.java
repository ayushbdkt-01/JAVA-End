import java.io.*;

public class program39 {

    public static boolean isPalindrome(String s){
        int start=0;
        int end=s.length()-1;
        while(start<=end){
            if(s.charAt(start)==s.charAt(end)){
                start++;
                end--;
            }
            else{
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        int count=0;

        try(BufferedReader br=new BufferedReader(new FileReader("data.txt"))){
            String line;

            while((line=br.readLine())!=null){
                String[] words=line.split(" ");

                for(String s: words){
                    if(isPalindrome(s)){
                        count++;
                    }

                }
            }
        }
        
        catch(Exception e){
            System.out.println("Exception Found");
        }

        System.out.println("Palindrome words are: "+count);
    }
}
