package exception;
import java.util.HashMap;

public class WordFrequencyCounter {
    public static HashMap<String, Integer> countWordFrequency(String text) {
        // Initialize a HashMap to store word frequencies
        HashMap<String, Integer> frequencyMap = new HashMap<>();

        // Split the text into words
        String[] words = text.split("\\s+");

        // Iterate through each word
        for (String word : words) {
            // Remove punctuation marks
            word = word.replaceAll("[^a-zA-Z]", "").toLowerCase();

            // Update the frequency map
            if (!word.isEmpty()) {
                frequencyMap.put(word, frequencyMap.getOrDefault(word, 0) + 1);
            }
        }

        // Return the frequency map
        return frequencyMap;
    }

    public static void main(String[] args) {
        String text = "This is a sample text. This text contains some sample words. Sample text for demonstration.";
        
        // Count word frequency
        HashMap<String, Integer> wordFrequency = countWordFrequency(text);
        
        // Display word frequency
        System.out.println("Word frequency:");
        for (String word : wordFrequency.keySet()) {
            System.out.println(word + ": " + wordFrequency.get(word));
        }
    }
}
