// File Handling in Java:
// Write a java file handling program to count and display the number of
// palindromes present in a text file "myfile.txt".
// Example: If the file "myfile.txt" contains the following lines,
// My name is NITIN
// Hello aaa and bbb wordHow are You
// ARORA is my friendOutput will be => 4










import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class p39 {
    
    public static void main(String[] args) {
        String filename = "myfile.txt";
        int palindromeCount = countPalindromes(filename);
        System.out.println("Number of palindromes: " + palindromeCount);
    }

    public static int countPalindromes(String filename) {
        int count = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] words = line.split("\\s+");
                for (String word : words) {
                    if (isPalindrome(word)) {
                        count++;
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        }

        return count;
    }

    public static boolean isPalindrome(String word) {
        int left = 0;
        int right = word.length() - 1;

        while (left < right) {
            if (word.charAt(left) != word.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}
