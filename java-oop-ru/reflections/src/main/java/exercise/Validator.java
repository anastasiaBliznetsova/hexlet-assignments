package exercise;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// BEGIN
public class Validator {
    public static List<String> validate(Address address) {
        List<String> fieldsNull = new ArrayList<>();
        Field[] fields = address.getClass().getDeclaredFields();
        for (Field field : fields) {
            NotNull notNull = field.getAnnotation((NotNull.class));
            if (notNull != null) {
                field.setAccessible(true);
                try {
                    if (field.get(address) == null) {
                        fieldsNull.add(field.getName());
                    }
                } catch (IllegalAccessException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return fieldsNull;
    }

    public static Map<String, List<String>> advancedValidate(Address address) {
        Map<String, List<String>> fieldsNotValidate = new HashMap<>();
        Field[] fields = address.getClass().getDeclaredFields();
        for (Field field : fields) {
            MinLength minLength = field.getAnnotation((MinLength.class));
            if (minLength != null) {
                field.setAccessible(true);
                try {
                    if (field.get(address).toString().length() < minLength.minLength()) {
                        fieldsNotValidate.put(field.getName(), new ArrayList<>(List.of("length less than " + minLength.minLength())));
                    }
                } catch (IllegalAccessException e) {
                    throw new RuntimeException(e);
                }
            }
        }

        List<String> fieldsNull = validate(address);
        if (!fieldsNull.isEmpty()) {
            for (String fieldName: fieldsNull) {
                fieldsNotValidate.put(fieldName, new ArrayList<>(List.of("can not be null")));
            }
        }
        return fieldsNotValidate;
    }
// END
}