import java.util.HashMap;

public class WordCount {
    public static void main(String[] args) {
        String str = "This is a sample string to count the number of words in it";
        String[] words = str.trim().split("\\s+");
        
        HashMap<String, Integer> wordCountMap = new HashMap<>();
        
        
        for (String word : words) {
            word = word.toLowerCase();
            if (wordCountMap.containsKey(word)) {
                wordCountMap.put(word, wordCountMap.get(word) + 1);
            } 
            else {
                wordCountMap.put(word, 1);
            }
        }
        System.out.println("Word Count:");
        for (String word : wordCountMap.keySet()) {
            System.out.println(word + ": " + wordCountMap.get(word));
        }
    }
}
