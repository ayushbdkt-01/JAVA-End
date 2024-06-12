// Create a class MyCalculator which consists of a single method power (int, int).
// This method takes two integers, n and p, as parameters and finds np. If either
// n or p is negative, then the method must throw an exception which says, "n
// and p should be non- negative".
// Input Format
// Each line of the input contains two integers, n and p. Output Format
// Each line of the output contains the result, if neither of n and p is negative.
// Otherwise, the output contains "n and p should be non- negative".
// Sample Input
// 3 5
// 38 2 4 2
// 0 0
// -1 -2
// -1 3
// Sample Output
// 243
// 16
// java.lang.Exception: n and p should not be zero. java.lang.Exception: n or p
// should not be negative. java. lang. Exception: n or p should not be negative.





import java.util.Scanner;

// Custom exception for negative values
class NegativeValueException extends Exception {
    public NegativeValueException(String message) {
        super(message);
    }
}

// MyCalculator class with power method
class MyCalculator {
    public int power(int n, int p) throws NegativeValueException {
        if (n < 0 || p < 0) {
            throw new NegativeValueException("n and p should be non-negative");
        }
        return (int) Math.pow(n, p);
    }
}

// Main class to test the implementation
public class p38 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MyCalculator calculator = new MyCalculator();

        while (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            int p = scanner.nextInt();
            try {
                int result = calculator.power(n, p);
                System.out.println(result);
            } catch (NegativeValueException e) {
                System.out.println("java.lang.Exception: " + e.getMessage());
            }
        }
        
        scanner.close();
    }
}
