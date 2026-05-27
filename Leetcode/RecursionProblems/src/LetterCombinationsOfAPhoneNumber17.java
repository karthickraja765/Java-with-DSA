import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class LetterCombinationsOfAPhoneNumber17 {
    public static void main(String[] args) {
//        pad("", "12");
        System.out.println(Numpad("", "1"));
    }

    static void pad(String processed, String unprocessed) {
        if (unprocessed.isEmpty()) {
            System.out.println(processed);
            return;
        }
        int digit = unprocessed.charAt(0) - '0'; //This will convert 2 into '2'

        for (int i = (digit - 1) * 3; i < digit * 3; i++) {
            char ch = (char) ('a' + i);
            pad(processed + ch, unprocessed.substring(1));
        }
    }
    static ArrayList<String> Numpad(String processed, String unprocessed) {
        if (unprocessed.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(processed);
            return list;
        }
        int digit = unprocessed.charAt(0) - '0';

        ArrayList<String> list = new ArrayList<>();
        for (int i = (digit - 1) * 3; i < digit * 3; i++) {
            char ch = (char) ('a' + i);
            list.addAll(Numpad(processed + ch, unprocessed.substring(1)));
        }
        return list;
    }
    static ArrayList<String> Numpadcrt(String processed, String unprocessed) {
        if (unprocessed.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(processed);
            return list;
        }
        String[] map = {
                "", "", "abc", "def", "ghi",
                "jkl", "mno", "pqrs", "tuv", "wxyz"
        };
        int digit = unprocessed.charAt(0) - '0';
        String letters = map[digit];

        ArrayList<String> list = new ArrayList<>();
        for (char cha : letters.toCharArray()) {
            list.addAll(Numpadcrt(processed + cha, unprocessed.substring(1)));
        }
        return list;
    }
}

//Submitted Answer:
/*

public List<String> letterCombinations(String digits) {
    if (digits.isEmpty()) {
        return new ArrayList<>();
    }
    return Numpadcrt("", digits);
}
static ArrayList<String> Numpadcrt(String processed, String unprocessed) {
    if (unprocessed.isEmpty()) {
        ArrayList<String> list = new ArrayList<>();
        list.add(processed);
        return list;
    }
    String[] map = {
            "", "", "abc", "def", "ghi",
            "jkl", "mno", "pqrs", "tuv", "wxyz"
    };
    int digit = unprocessed.charAt(0) - '0';
    String letters = map[digit];

    ArrayList<String> list = new ArrayList<>();
    for (char cha : letters.toCharArray()) {
        list.addAll(Numpadcrt(processed + cha, unprocessed.substring(1)));
    }
    return list;
}

*/