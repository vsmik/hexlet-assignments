package exercise;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

// BEGIN
class App {
    public static void swapKeyValue(KeyValueStorage storage) {
        storage.toMap().keySet()
                .forEach(key -> {
                    String value = storage.get(key, "default");
                    storage.unset(key);
                    storage.set(value, key);
                });
    }
}
// END
