package OOP7;

import java.util.List;
import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {
        List<Integer> vector = new Vector<>(); // reference of List<Integer> is referring to object of Vector<> class
        vector.add(12);
        vector.add(23);
        vector.add(34);
        vector.add(45);
        System.out.println(vector);
    }
}
/*
Concept:
* Vector class implements list. Means, does have the same methods and collections used in ArrayList and LinkedList.
 But the inner implementation and working is different.
* ArrayList is faster than vector class. Because arraylist is not synchronised.
*/