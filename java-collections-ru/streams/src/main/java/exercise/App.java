package exercise;

import java.util.List;
import java.util.Arrays;
import org.apache.commons.lang3.StringUtils;

// BEGIN
public class App {
    public static long getCountOfFreeEmails(List<String> emailsList) {
        long emailCount = emailsList.stream()
                .filter(em -> StringUtils.isNotBlank(em))
                .filter(em -> em.endsWith("gmail.com") || em.endsWith("yandex.ru") || em.endsWith("hotmail.com"))
                .count();
        return emailCount;
    }
}
// END

