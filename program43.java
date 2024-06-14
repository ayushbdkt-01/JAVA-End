import java.util.*;

public class program43 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<String> arr=new ArrayList<>();

        for(int i=0;i<5;i++){
            String s=sc.next();
            arr.add(s);
        }

        for(int i=0;i<5-1;i+=2){
            Collections.swap(arr, i, i+1);
        }

        System.out.println(arr);
        sc.close();
    }
    
}
