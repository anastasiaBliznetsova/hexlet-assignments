package exercise;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// BEGIN
public class App {
    public static LinkedHashMap<String, String> genDiff(Map<String, Object> data1, Map<String, Object> data2) {
        Set<String> addedSet = new HashSet<>(data2.keySet());
        Set<String> deletedSet = new HashSet<>(data1.keySet());
        addedSet.removeAll(deletedSet);
        deletedSet.removeAll(addedSet);
        Set<String> intersection = new HashSet<>(data1.keySet());
        intersection.retainAll(data2.keySet());
        Set<String> data2Key = new HashSet<>(data2.keySet());

        Map<String, String> resultTreeMap = new TreeMap<>();
        for (String key: addedSet) {
            resultTreeMap.put(key, "added");
        }
        for (String key: deletedSet) {
            resultTreeMap.put(key, "deleted");
        }
        for (String key: data2Key) {
            if (intersection.contains(key)) {
                if (data1.get(key).equals(data2.get(key))) {
                    resultTreeMap.put(key, "unchanged");
                } else {
                    resultTreeMap.put(key, "changed");
                }
            }
        }
        return new LinkedHashMap<>(resultTreeMap);
    }
}
//END

