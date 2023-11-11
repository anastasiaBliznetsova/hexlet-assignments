package exercise;

import java.util.HashMap;
import java.util.Map;

// BEGIN
class FileKV implements KeyValueStorage {
    private String path;
    Map<String, String> map;

    public FileKV(String path, Map<String, String> map) {
        this.map = new HashMap<>(map);
        this.path = path;
        Utils.writeFile(path, Utils.serialize(map));
    }

    @Override
    public void set(String key, String value) {
        map.put(key, value);
        Utils.writeFile(path, Utils.serialize(map));
    }

    @Override
    public void unset(String key) {
        map.remove(key);
        Utils.writeFile(path, Utils.serialize(map));
    }

    @Override
    public String get(String key, String defaultValue) {
        return map.getOrDefault(key, defaultValue);
    }

    @Override
    public Map<String, String> toMap() {
        return new HashMap<>(map);
    }
}
// END
