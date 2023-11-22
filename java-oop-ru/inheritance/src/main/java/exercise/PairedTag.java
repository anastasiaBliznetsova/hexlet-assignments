package exercise;

import java.util.Map;
import java.util.List;
import java.util.stream.Collectors;

// BEGIN
class PairedTag extends Tag {
    private String text;
    private List<Tag> list;

    public PairedTag(String nameTag, Map<String, String> map, String text, List<Tag> list) {
        super(nameTag, map);
        this.text = text;
        this.list = list;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("<" + nameTag);
        for (Map.Entry<String, String> entry : map.entrySet()) {
            result.append(" ").append(entry.getKey()).append("=\"").append(entry.getValue()).append("\"");
        }
        result.append(">");
        list.forEach(map -> result.append(map.toString()));
        result.append(text).append("</").append(nameTag).append(">");
        return result.toString();
    }
}
// END
