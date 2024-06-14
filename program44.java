import java.util.*;

public class program44 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        ArrayList<String> arr1=new ArrayList<>();
        ArrayList<String> arr2=new ArrayList<>();

        System.out.println("Enter size of first array: ");
        int n1=sc.nextInt();
        for(int i=0;i<n1;i++){
            String s=sc.next();
            arr1.add(s);
        }

        System.out.println("Enter size of second array: ");
        int n2=sc.nextInt();
        for(int i=0;i<n2;i++){
            String s=sc.next();
            arr2.add(s);
        }

        ArrayList<String> arr3=new ArrayList<>();

        int i=0;
        int j=0;

        while(i<n1 && j<n2){
            arr3.add(arr1.get(i));
            arr3.add(arr2.get(j));
            i++;
            j++;
        }

        while(i<n1){
            arr3.add(arr1.get(i));
            i++;
        }

        while(i<n1){
            arr3.add(arr2.get(i));
            j++;
        }

        System.out.println("Final merged array: ");
        System.out.println(arr3);

        sc.close();
    }
}
