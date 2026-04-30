package OOP4;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        A obj = new A(7, "Justin");

        System.out.println(obj.name);
        System.out.println(Arrays.toString(obj.arr));

//        System.out.println(obj.num); //You can't access the number. Because it is private.
        System.out.println(obj.getNum()); // even though num is private. We can get the num value by getter and setter method (Because they both are public)
        obj.setNum(10); // sets the 7 value to 10. Now num = 10;
        System.out.println(obj.getNum()); //Prints: 10
    }
}