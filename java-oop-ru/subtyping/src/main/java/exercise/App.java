package exercise;

import java.util.Map;

// BEGIN
class App {
    public static void swapKeyValue(KeyValueStorage map) {
        for (String key: map.toMap().keySet()) {
            map.set(map.get(key, ""), key);
            map.unset(key);
        }
    }
}
// END
