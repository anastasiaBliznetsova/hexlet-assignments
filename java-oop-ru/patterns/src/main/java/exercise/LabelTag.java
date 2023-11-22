package exercise;

// BEGIN
public class LabelTag implements TagInterface {
    public String text;
    public TagInterface value;

    public LabelTag(String text, TagInterface value) {
        this.text = text;
        this.value = value;
    }

    @Override
    public String render() {
        return "<label>" + text + value.render() + "</label>";
    }
}
// END
