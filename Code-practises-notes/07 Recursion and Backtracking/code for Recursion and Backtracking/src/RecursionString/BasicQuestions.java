package RecursionString;

public class BasicQuestions {
    public static void main(String[] args) {
        skipA("", "bacaeacafape");

        String ans = skip("baccada");
        System.out.println(ans);

        System.out.println(skipApple("baccappledappleappleapplexyz"));

        System.out.println(skipAppNotApple("baccappwled"));
    }

    // This code will skip the character "a" if found in the string
    static void skipA(String ans, String string) {
        if (string.isEmpty()) { // checking if the String is empty
            System.out.println(ans); // If original string is empty then print the ans string
            return;
        }
        char ch =  string.charAt(0); // character at 0th index
        if (ch == 'a') {
            skipA(ans, string.substring(1)); // answerString will be same, starting element in original string is moved by one
        } else {
            skipA(ans + ch, string.substring(1)); //If it is not 'a' then we have to add the element to the final and move next.
        }
    }

    // same working as the above one. But it doesn't create a separate new answer string and update it.
    // It just modifies the original one itself and returns the string without "a"'s in it
    static String skip(String string) {
        if (string.isEmpty()) {
            return "";
        }
        char ch = string.charAt(0);
        if (ch == 'a') {
            return skip(string.substring(1));
        } else {
            return ch + skip(string.substring(1));
        }
    }

    // This code skips the letter apple if found in the string
    static String skipApple(String string) {
        if (string.isEmpty()) {
            return "";
        }
        if (string.startsWith("apple")) { // If string element starts with apple, Skip 5 characters
            return skipApple(string.substring(5));
        } else {
            return string.charAt(0) + skipApple(string.substring(1)); // else, add the current character and move by one
        }
    }

    // This code skips the letter "app" if it is not "apple".
    static String skipAppNotApple(String string) {
        if (string.isEmpty()) {
            return "";
        }
        if (string.startsWith("app") && !(string.startsWith("apple"))) { // If the string starts with "app" and not "apple", then skip by 3 characters
            return skipAppNotApple(string.substring(3));
        } else {
            return string.charAt(0) + skipAppNotApple(string.substring(1)); // else, add the current character and move by one
        }
    }
}