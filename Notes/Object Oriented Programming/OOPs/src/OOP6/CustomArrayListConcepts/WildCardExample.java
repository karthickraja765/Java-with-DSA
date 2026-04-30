package OOP6.CustomArrayListConcepts;

import java.util.Arrays;
import java.util.List;

/*
Concept of wildcard:
* In Java, a wildcard refers to the use of ? in generics to represent an unknown type.
* It is primarily used to make code more flexible when working with collections or generic APIs.
* Core idea: “I don’t know the exact type, but I want to work with a range of types safely.”
* wild Card restricts the Datatype of your ArrayList. Like restricted only numbers, Strings, or float.
*/

public class WildCardExample<T extends Number> { // T extends Number, T extends String, T extends Float
    private Object[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0;

    public WildCardExample() {
        this.data = new Object[DEFAULT_SIZE];
    }

    public void getlist(List <? extends Number> list) {
        // If you put this argument: (List <Number> list) You cannot pass the Subclass of Number here
        // Do something
        // Then you can only pass number type (You can pass the Subclass of Number here)
    }

    private void Resize() {
        Object[] temp = new Object[data.length * 2];
        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }

    private boolean isFull() {
        return size == data.length;
    }

    public void add(T num) {
        if (isFull()) {
            Resize();
        }
        data[size++] = num;
    }

    public T remove() {
        T removed = (T) (data[--size]);
        return removed;
    }

    public T get(int index) {
        return (T)data[index];
    }

    public int size() {
        return size;
    }

    public void set(int index, T value) {
        data[index] = value;
    }

    @Override
    public String toString() {
        return "WildCardExample data = {" +
                Arrays.toString(data) +
                ", size = " + size +
                "}";
    }

    public static void main(String[] args) {
        WildCardExample<Integer> list1 = new WildCardExample<>();
        list1.add(11);
        list1.add(22);
        list1.add(33);

        System.out.println(list1);
    }
}