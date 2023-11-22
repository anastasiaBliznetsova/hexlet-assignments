package exercise;

import java.util.HashMap;
import java.util.stream.Collectors;
import java.util.Map;

// BEGIN
class Tag {
    public String nameTag;
    public Map<String, String> map = new HashMap<>();

    public Tag(String nameTag, Map<String, String> map) {
        this.nameTag = nameTag;
        this.map = map;
    }

    public String getNameTag() {
        return nameTag;
    }

    public Map<String, String> getMap() {
        return map;
    }
}
// END
