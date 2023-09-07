package exercise;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

// BEGIN
public class App {
    public static boolean scrabble(String characterSet, String word) {
        List<String> setList = stringToList(characterSet);
        List<String> wordList = stringToList(word.toLowerCase());

        for (String w: wordList) {
            if (setList.contains(w)) {
                setList.remove(w);
            } else {
                return false;
            }
        }
        return true;
    }

    public static List<String> stringToList(String str) {
        List<String> list = new ArrayList<>();
        char[] charSet = str.toCharArray();
        for (char c : charSet) {
            list.add(Character.toString(c));
        }
        return list;
    }
}
//END

