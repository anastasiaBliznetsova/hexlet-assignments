package exercise;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// BEGIN
public class App {
    public static String getForwardedVariables(String confFile) {
        String[] strings = confFile.split("\n");
        List<String> listOfStrings = new ArrayList<>();
        Collections.addAll(listOfStrings, strings);
        return listOfStrings.stream()
                .filter(str -> str.startsWith("environment="))
                .map(str -> str.split(","))
                .flatMap(Stream::of)
                .filter(str -> str.contains("X_FORWARDED_"))
                .map(str -> str.replaceAll("X_FORWARDED_", "")
                        .replaceAll("environment=", "")
                        .replaceAll("\"", ""))
                .collect(Collectors.joining(","));
    }
}
//END