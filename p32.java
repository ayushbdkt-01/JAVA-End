// Define a class Word Example having the followingdescription:
// Data members/instance variables:
// private String strdata: to store a sentence.
// Parameterized Constructor WordExample(String) : Accept a
// sentence which
// may be terminated by either’.’, ‘? ’or’!’ only. The wordsmay be separated by
// more than one blank space and are in UPPER CASE.
// Member Methods:
// void countWord(): Find the number of wordsbeginning and
// ending with a vowel.
// void placeWord(): Place the words which begin andend with a vowel at the
// beginning, followed by the remaining words as they occur in the sentence




import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class p32 {
    private String strdata;

    // Parameterized Constructor
    public p32(String strdata) {
        // Ensuring the sentence is terminated by '.', '!' or '?' and is in uppercase.
        if (strdata.endsWith(".") || strdata.endsWith("?") || strdata.endsWith("!")) {
            this.strdata = strdata.toUpperCase();
        } else {
            throw new IllegalArgumentException("Sentence must be terminated by '.', '?' or '!'");
        }
    }

    // Method to count words beginning and ending with a vowel
    public void countWord() {
        String[] words = strdata.split("\\s+");
        int count = 0;
        for (String word : words) {
            if (word.length() > 0 && isVowel(word.charAt(0)) && isVowel(word.charAt(word.length() - 1))) {
                count++;
            }
        }
        System.out.println("Number of words beginning and ending with a vowel: " + count);
    }

    // Method to place words beginning and ending with a vowel at the beginning
    public void placeWord() {
        String[] words = strdata.split("\\s+");
        List<String> vowelWords = new ArrayList<>();
        List<String> otherWords = new ArrayList<>();
        
        for (String word : words) {
            if (word.length() > 0 && isVowel(word.charAt(0)) && isVowel(word.charAt(word.length() - 1))) {
                vowelWords.add(word);
            } else {
                otherWords.add(word);
            }
        }

        // Combine the vowel words and other words
        vowelWords.addAll(otherWords);
        String result = String.join(" ", vowelWords);
        System.out.println("Reordered Sentence: " + result);
    }

    // Helper method to check if a character is a vowel
    private boolean isVowel(char ch) {
        return "AEIOU".indexOf(ch) != -1;
    }

    public static void main(String[] args) {
        // Example usage
        p32 example = new p32("APPLE EAGLE IS IT OAK. UMBRELLA.");
        example.countWord();
        example.placeWord();
    }
}

