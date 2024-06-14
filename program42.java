import java.util.*;
public class program42{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> a= new ArrayList<>();
        for(int i = 0; i<3; i++ ){
            String n = sc.next();
            a.add(n);
        }

        for(int i=0;i<a.size();i++){
            String s=a.get(i);
            if(s.length()%2==0){
                a.remove(i);
            }
        }
        
        System.out.println(a);
        sc.close();

    }
}