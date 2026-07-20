package RecursionString;

import java.util.ArrayList;

public class Subsequence {
    public static void main(String[] args) {
//        System.out.println("Print All Subsequences: ");
//        subSequence("", "abc");
//
//        System.out.println("Subsequences in an Arraylist: ");
//        ArrayList<String> ans = subSequenceReturn("", "abc");
//        System.out.println(ans);

        System.out.println("Subsequence Ascii");
        subSequenceAscii("", "abc");

        System.out.println("Returning Ascii values it in a Arraylist");
        ArrayList<String> answer = subSequenceAsciiReturn("", "abc");
        System.out.println(answer);
    }

    static void subSequence(String processed, String unprocessed) {
        if (unprocessed.isEmpty()) { // Base condition is if the unprocessed becomes empty we have to print the processed
            System.out.println(processed);
            return;
        }
        char ch = unprocessed.charAt(0); // for every first character

        subSequence(processed + ch , unprocessed.substring(1)); // taking the element and adding it to the processed and move by next character
        subSequence(processed , unprocessed.substring(1));  // we just skip the character and move to next character
    }

    static ArrayList<String> subSequenceReturn(String processed, String unprocessed) {
        if (unprocessed.isEmpty()) {
            ArrayList<String> empty = new ArrayList<>(); // we need to create new ArrayList for it
            empty.add(processed);
            return empty;
        }
        char ch = unprocessed.charAt(0);

        ArrayList<String> left = subSequenceReturn(processed + ch , unprocessed.substring(1)); // taking the character
        ArrayList<String> right = subSequenceReturn(processed , unprocessed.substring(1)); // ignoring the character

        left.addAll(right); // adding the answers to a single list and Returning it (You can also add it to right).
        return left;
    }

    static void subSequenceAscii(String processed, String unprocessed) {
        if (unprocessed.isEmpty()) {
            System.out.println(processed);
            return;
        }
        char ch = unprocessed.charAt(0);

        subSequenceAscii(processed + (ch + 0), unprocessed.substring(1)); // taking it.
        subSequenceAscii(processed , unprocessed.substring(1)); // ignoring it.
        subSequenceAscii(processed + (ch + 0), unprocessed.substring(1));  // here (Ch + 0) is type casting the character to the int which is the Ascii value of the character.
    }

    static ArrayList<String> subSequenceAsciiReturn(String processed, String unprocessed) {
        if (unprocessed.isEmpty()) {
            ArrayList<String> empty = new ArrayList<>();
            empty.add(processed);
            return empty;
        }
        char ch = unprocessed.charAt(0);

        ArrayList<String> first = subSequenceAsciiReturn(processed + ch , unprocessed.substring(1));
        ArrayList<String> second = subSequenceAsciiReturn(processed , unprocessed.substring(1));
        ArrayList<String> third = subSequenceAsciiReturn(processed + (ch + 0), unprocessed.substring(1));

        first.addAll(second); // adding the answers to a single list and Returning it.
        first.addAll(third);
        return first;
    }
}