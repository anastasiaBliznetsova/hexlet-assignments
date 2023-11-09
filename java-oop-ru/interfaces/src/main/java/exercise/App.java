package exercise;

import java.util.*;
import java.util.stream.Collectors;

// BEGIN
public class App {
    public static List<String> buildApartmentsList(List<Home> apartments, int n) {
        List<String> result = new ArrayList<>();
        apartments.sort((Home::compareTo));
        for (Home object: apartments) {
            result.add(object.toString());
        }
        if (n > apartments.size()) {
            n = apartments.size();
        }
        return result.subList(0, n);
    }
}
// END
