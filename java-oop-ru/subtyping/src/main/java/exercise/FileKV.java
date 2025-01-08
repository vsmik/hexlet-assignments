package exercise;

import java.util.Map;

import static exercise.Utils.*;

// BEGIN
class FileKV implements KeyValueStorage {
    Map<String, String> data;
    String path;

    public FileKV (String path, Map<String, String> data) {
        this.path = path;
        data.forEach(this::set);
    }

    @Override
    public void set(String key, String value) {
        Map<String, String> map = toMap();
        map.put(key, value);
        writeFile(path, serialize(map));
    }

    @Override
    public void unset(String key) {
        Map<String, String> map = toMap();
        map.remove(key);
        writeFile(path, serialize(map));
    }

    @Override
    public String get(String key, String defaultValue) {
        Map<String, String> map = toMap();
        return map.getOrDefault(key, defaultValue);
    }

    @Override
    public Map<String, String> toMap() {
        String content = readFile(path);
        return deserialize(content);
    }
}
// END
