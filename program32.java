import java.util.*;

public class program32 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String[] arr=s.split(" ");

        int count=0;

        for(String str: arr){
            if(str.charAt(0)=='a' ||(str.charAt(0))=='e' ||(str.charAt(0))=='i' ||(str.charAt(0))=='o' ||(str.charAt(0))=='u'){
                if(str.charAt(str.length()-1)=='a' ||(str.charAt(str.length()-1))=='e' ||(str.charAt(str.length()-1))=='i' ||(str.charAt(str.length()-1))=='o' ||(str.charAt(str.length()-1))=='u'){
                    count++;
                }
            }
        }
        System.out.println("Words are: "+count);
        sc.close();
    }
}
