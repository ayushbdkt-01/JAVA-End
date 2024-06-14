import java.util.*;
public class program33 {
    public static void array( int a[] , int t ) {
        int n = a.length;
        System.out.print("pair : ");
        for( int i=0; i<n-1; i++ ) {
            for( int j = i+1; j<n; j++ ) {
                if( a[i] + a[j] == t ) {
                    System.out.println(i + " " + j);
                }
            }
        }
    }

    public static void arr( int a[] , int n1 , int b[] , int n2) {
        int []c = new int[n1+n2] ;
        int  k =0;
        for( int i=0; i<n1; i++ ) {
            c[k] = a[i];
        }
        for( int j =0; j<n2; j++ ) {
            c[n1++] =  b[j];
        }
        Arrays.sort(c);
        for( int i=0; i<c.length; i++ ) {
            System.out.print(" " + c[i]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a[] = {1,4,2,3,5,5};
        array(a , 10);

        int b[] = {4,6,2,9};
        int d[] = {7,2,1,8,9,3};
        arr(b,b.length,d,d.length);

        sc.close();
    }
}