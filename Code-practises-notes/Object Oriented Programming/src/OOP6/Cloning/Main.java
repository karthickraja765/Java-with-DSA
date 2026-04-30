package OOP6.Cloning;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Human Josh = new Human("Josh", 20);
        System.out.println(Josh.name);
        System.out.println(Josh.age);
//        Human twin = new Human(Josh);

        System.out.println("------------------------------------------------------------------");

        // why clone? Because previously the new keyword takes a bit of more in compiling the code so its kinda slow and also extra code for constructors.
        // clone is much faster method.
        Human twin = (Human) Josh.clone();
        System.out.println(twin.age);
        System.out.println(twin.name);

        System.out.println("------------------------------------------------------------------");

        System.out.println("Josh Array: " + Arrays.toString(Josh.arr));
        Josh.arr[0] = 99;

        System.out.println("------------------------------------------------------------------");

//        System.out.println("New Josh Array: " + Arrays.toString(Josh.arr));
//        System.out.println("Twin Array: " + Arrays.toString(twin.arr)); // shallow coping: changes in the original array is modified in the copied ones.

        System.out.println("------------------------------------------------------------------");

        // deep coping
        System.out.println("Josh New Array: " + Arrays.toString(Josh.arr)); // old one did not change
        System.out.println("Twin Array: " + Arrays.toString(twin.arr)); // twin is obviously changed
    }
}