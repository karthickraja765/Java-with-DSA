package OOP6.CustomArrayListConcepts;

import java.util.ArrayList;
import java.util.Arrays;

public class CustomArrayList {
    private int[] data;
    private static int DEFAULT_SIZE = 10; // Internal Array list size
    private int size = 0; // it also works as the index value

    public CustomArrayList() { // constructor assigning the array size.
        this.data = new int[DEFAULT_SIZE];
    }

    private void Resize() { //If it is full, We create a temporary variable with twice the previous length.
        int[] temp = new int[data.length * 2];
        for (int i = 0; i < data.length; i++) { // copy the current items to the temp array.
            temp[i] = data[i];
        }
        data = temp; // reassigning the previous array to the new array (temp)
    }

    private boolean isFull() { //When the function isFull calls this method. It will return whether it's true or not!
        return size == data.length;
    }

    // List basic methods are add, remove, get the index value, size of the array, etc. So we create a separate methods for it
    public void add(int num) { // after declaring the size of the array, we need to add the elements.
        if (isFull()) { // condition to check whether the array is full?
            Resize();
        }
        data[size] = num; // If it's not full, add the element next to the previous element.
        size++;
    }

    public int remove() { // method to remove the element and return the size after removing.
        int remove = data[size];
        size--;
        return remove;
    }

    public int get(int index) { // returning the index of the element when passed an index.
        return data[index];
    }

    public int size() { // method to tell what is the current size
        return size;
    }

    public void set(int index, int value) { // Changing the index element value.
        data[index] = value;
    }

    @Override
    public String toString() { //toString method
        return "CustomArray List: data = {" +
                Arrays.toString(data) +
                ", size = " + size +
                "}";
    }

    public static void main(String[] args) {
        CustomArrayList AL = new CustomArrayList();
        AL.add(12);
        AL.add(13);
        AL.add(14);
        AL.add(15);

        for (int i = 0; i < 18; i++) {
            AL.add(2 * i);
        }
        System.out.println(AL);

        ArrayList<Integer> list = new ArrayList<>();
        list.add(12);
        System.out.println(list);

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Lana");
        System.out.println(list2);
     }
}