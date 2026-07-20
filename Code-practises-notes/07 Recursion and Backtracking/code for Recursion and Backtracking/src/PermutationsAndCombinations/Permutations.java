package PermutationsAndCombinations;

import java.util.ArrayList;
import java.util.Arrays;

public class Permutations {
    public static void main(String[] args) {
        System.out.println("Permutation: ");
        permutation("", "abc");

        System.out.println("Permutation in a Array list:");
        ArrayList<String> ans = permutationList("", "abc");
        System.out.println(ans);

        System.out.println("Permutation count: ");
        int countAns = permutationCount("", "abc");
        System.out.println(countAns);
    }

    static void permutation(String processed, String unprocessed) {
        if (unprocessed.isEmpty()){ // if the unprocessed is empty, print the processed
            System.out.println(processed);
            return;
        }
        char ch = unprocessed.charAt(0);
        for (int i = 0; i <= processed.length(); i++) { // loop will run until the total no of current processed elements at every level
            String firstString = processed.substring(0, i);
            String secondString = processed.substring(i, processed.length());
            permutation(firstString + ch + secondString, unprocessed.substring(1));
        }
    }

    static ArrayList<String> permutationList(String processed, String unprocessed) {
        if (unprocessed.isEmpty()) { //Base condition is if the unprocessed becomes empty we have to print the processed
            ArrayList<String> empty = new ArrayList<>(); //For showing an empty list, We need to create new ArrayList for it
            empty.add(processed);
            return empty;
        }
        char ch = unprocessed.charAt(0);
        ArrayList<String> answer = new ArrayList<>();
        for (int i = 0; i <= processed.length(); i++) {
            String firstString = processed.substring(0, i);
            String secondString = processed.substring(i, processed.length());
            answer.addAll(permutationList(firstString + ch + secondString, unprocessed.substring(1)));
        }
        return answer;
    }

    static int permutationCount(String processed, String unprocessed) {
        if (unprocessed.isEmpty()) { //Base condition is if the unprocessed becomes empty we have to print the processed
            return 1;
        }
        int count = 0; //Declare count variable
        char ch = unprocessed.charAt(0);
        for (int i = 0; i <= processed.length(); i++) { //Loop will run until the total no of current unprocessed elements at every level.
            String firstString = processed.substring(0, i);
            String secondString = processed.substring(i , processed.length());
            count = count + permutationCount(firstString + ch + secondString, unprocessed.substring(1));
        }
        return count;
    }
}