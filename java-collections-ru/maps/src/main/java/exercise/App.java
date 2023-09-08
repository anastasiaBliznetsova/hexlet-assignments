package exercise;

import java.util.HashMap;
import java.util.Map;

// BEGIN
public class App {
    public static Map<String, Integer> getWordCount(String str) {
        Map<String, Integer> mapWordCount = new HashMap<String, Integer>();
        if (str.equals("")) {
            return mapWordCount;
        }
        String[] words = str.split(" ");
        int p = 0;
        for (String word : words) {
            p = 0;
            if (!mapWordCount.containsKey(word)) {
                mapWordCount.put(word, 1);
            } else {
                p = mapWordCount.get(word) + 1;
                mapWordCount.put(word, p);
            }
        }
        return mapWordCount;
    }

    public static String toString(Map<String, Integer> map) {
        if (map.isEmpty()) {
            return "{}";
        }
        StringBuilder strMap = new StringBuilder("{\n");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            strMap.append("  ").append(entry.getKey()).append(": ").append(entry.getValue()).append("\n");
        }
        strMap.append("}");
        return strMap.toString();
    }
}
//END

