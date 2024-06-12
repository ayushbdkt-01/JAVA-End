// Method overloading (Compile time Polymorphism):
// Write a Java program to create a class called
// ArrayDemo and overload arrayFunc() function.
// void arrayFunc(int [], int) To find all pairs of elements in an
// Array whose sum is equal to a givennumber :
// Array numbers= [4, 6, 5, -10, 8, 5, 20], target=10
// Output :
// Pairs of elements whose sum is 10 are :4 + 6 = 10
// 5 + 5 = 10
// -10 + 20 = 10
// void arrayFunc(int A[], int p, int B[], int q) Giventwo sorted arrays A
// and B of size p and q, Overload method arrayFunc() to merge elements of
// A with B bymaintaining the sorted order i.e. fill A with first p smallest
// elements and fill B with remaining elements.



import java.util.Arrays;

public class p33 {

    // Method to find all pairs of elements in an array whose sum is equal to a given number
    public void arrayFunc(int[] arr, int target) {
        System.out.println("Pairs of elements whose sum is " + target + " are:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    System.out.println(arr[i] + " + " + arr[j] + " = " + target);
                }
            }
        }
    }

    // Method to merge two sorted arrays A and B while maintaining sorted order
    public void arrayFunc(int[] A, int p, int[] B, int q) {
        int[] C = new int[p + q];
        System.arraycopy(A, 0, C, 0, p);
        System.arraycopy(B, 0, C, p, q);
        
        Arrays.sort(C);

        System.arraycopy(C, 0, A, 0, p);
        System.arraycopy(C, p, B, 0, q);

        System.out.println("Merged arrays in sorted order:");
        System.out.println("Array A: " + Arrays.toString(A));
        System.out.println("Array B: " + Arrays.toString(B));
    }

    public static void main(String[] args) {
        p33 demo = new p33();

        // Test case for finding pairs with sum equal to target
        int[] numbers = {4, 6, 5, -10, 8, 5, 20};
        int target = 10;
        demo.arrayFunc(numbers, target);

        // Test case for merging two sorted arrays
        int[] A = {1, 3, 5};
        int[] B = {2, 4, 6, 7, 8};
        demo.arrayFunc(A, A.length, B, B.length);
    }
}
