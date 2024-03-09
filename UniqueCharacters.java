package exception;

import java.util.HashSet;

public class UniqueCharacters {
    public static HashSet<Character> getUniqueCharacters(String inputString) {
        // Initialize a HashSet to store unique characters
        HashSet<Character> uniqueSet = new HashSet<>();

        // Convert the input string to an array of characters
        char[] chars = inputString.toCharArray();

        // Iterate through each character in the array
        for (char c : chars) {
            // Add the character to the HashSet
            uniqueSet.add(c);
        }

        // Return the HashSet containing unique characters
        return uniqueSet;
    }

    public static void main(String[] args) {
        String inputString = "hello world";
        HashSet<Character> uniqueChars = getUniqueCharacters(inputString);

        // Print unique characters
        System.out.println("Unique characters in the string: " + uniqueChars);
    }
}
