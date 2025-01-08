package exercise;

// BEGIN
public class LabelTag implements TagInterface{
    private String labelTag;
    private TagInterface inputTag;

    public LabelTag(String labelTag, TagInterface inputTag) {
        this.labelTag = labelTag;
        this.inputTag = inputTag;
    }

    @Override
    public String render() {
        String result = "<label>" + labelTag + inputTag.render() + "</label>";
        return result;
    }
}
// END
