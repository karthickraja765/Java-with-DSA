package src;

public class searchingInStrings { // Linear Search in strings
    public static void main(String[] args) {
        String name = "Alex";
        char target = 't';
        System.out.println(search(name, target));
        System.out.println(searchingStringInArray(name, target));
    }

    // Type 1: Checks if there is a character in the string or not!
    static boolean search(String name, char target) {
        if (name.length() == 0) { // it can also be replaced with name.isEmpty();
            return false;
        }
        for (int i = 0; i < name.length(); i++) {
            if (target == name.charAt(i)){ // In strings, we cant use name[i] like in arrays, we use "string_name.characterAt(index);"
                return true;
            }
        }
        return false; //false is returned when the loop didn't find the target value
    }

    // Type 2: first we convert it to an array and iterate to find the character.
    static boolean searchingStringInArray(String name, char target) {
        if (name.isEmpty()) { // it can also be replaced with name.isEmpty();
            return false;
        }
        // for each loop or enhanced for loop
        for (char ch : name.toCharArray()){ // This "name.toCharArray()" converts the string into a character array (char[])
            if (ch == target){
                return true;
            }
        }
        return false;
    }
}

/*
Example:
    String name = "karthik";
    char[] arr = name.toCharArray();
Output:
    arr = ['k', 'a', 'r', 't', 'h', 'i', 'k']

You can also do this:
    char[] arr = name.toCharArray();
    for (int i = 0; i < arr.length; i++) {
        if (arr[i] == target) {
            return true;
        }
    }

These two are basically similar: name.charAt(i) and name.toCharArray()[i]. But,
    •	charAt(i) → no extra memory
	•	toCharArray() → creates a new array (extra space)

Run this line in the main function and it converts the name to array.
    System.out.println(Arrays.toString(name.toCharArray()));
*/