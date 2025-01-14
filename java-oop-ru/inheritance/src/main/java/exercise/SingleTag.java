package exercise;

import java.util.Map;

// BEGIN
public class SingleTag extends Tag {
    public SingleTag(String name, Map<String, String> attributes){
        super(name, attributes);
    }

    @Override
    public String toString() {
        return String.format("<%s%s>", getName(), attributesToString());
    }
}
// END
