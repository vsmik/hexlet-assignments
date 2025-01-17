package exercise;

import java.lang.reflect.Field;
import java.util.*;
import java.util.stream.Collectors;

// BEGIN
class Validator {
    public static List<String> validate(Address address) {
        List<Field> fields = List.of(address.getClass().getDeclaredFields());
        var result = fields.stream()
                .filter(field -> field.isAnnotationPresent(NotNull.class))
                .filter(field -> {
                    Object value;
                    try {
                        field.setAccessible(true);
                        value = field.get(address);
                    } catch (IllegalAccessException e) {
                        throw new RuntimeException(e);
                    }
                    return value == null;
                })
                .map(Field::getName)
                .collect(Collectors.toList());
        return result;
    }
}
// END
