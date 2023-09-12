package exercise;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.Map.Entry;

// BEGIN
public class App {
    public static List<Map<String, String>> findWhere(List<Map<String, String>> books, Map<String, String> book) {
        List<Map<String, String>> suitableBooks = new ArrayList<>();
        for (Map<String, String> map : books) {
            if (map.values().containsAll(book.values())) {
                    suitableBooks.add(map);
            }
        }
        return suitableBooks;
    }
}
//END

