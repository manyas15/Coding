import java.util.*;

public class Exercise {

    public static Map<String,Integer> wordsLength() {
        
        List<String> words = List.of("apple", "banana", "orange", "grape", "kiwi");

        Map<String, Integer> map = new HashMap<>();
        for (String word : words) {
            map.put(word, word.length());
        }

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        return map;
    }
}
