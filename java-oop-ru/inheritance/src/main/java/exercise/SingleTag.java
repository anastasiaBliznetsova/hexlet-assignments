package exercise;

import java.util.Map;

// BEGIN
class SingleTag extends Tag {
    public SingleTag(String nameTag, Map<String, String> map) {
        super(nameTag, map);
    }

    @Override
    public String toString() {
        String result = "<" + nameTag;
        for (Map.Entry<String, String> entry : map.entrySet()) {
            result += " " + entry.getKey() + "=\"" + entry.getValue() + "\"";
        }
        result += ">";
        return result;
    }
}
// END
