import java.util.*;

public class PhraseAnalyzer {

    public static TreeMap<String, Integer> wordCount(String sentence) {

        // Convert to lowercase
        sentence = sentence.toLowerCase();

        // Remove special characters (?, . , !)
        sentence = sentence.replaceAll("[\\?\\.,!]", "");

        // Split sentence into words
        String[] words = sentence.split("\\s+");

        // Create TreeMap (sorted automatically)
        TreeMap<String, Integer> wordMap = new TreeMap<>();

        // Count words
        for (String word : words) {
            if (wordMap.containsKey(word)) {
                wordMap.put(word, wordMap.get(word) + 1);
            } else {
                wordMap.put(word, 1);
            }
        }

        return wordMap;
    }
}
