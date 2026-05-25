package OOP6.CustomArrayListConcepts;

import java.util.Arrays;

public class CustomArrayListUsingGenerics<T> {
    private Object[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0;

    public CustomArrayListUsingGenerics() {
        this.data = new Object[DEFAULT_SIZE];
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
        T removed =(T)(data[--size]);
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
        return "CustomArrayListUsingGenerics data = {" +
                Arrays.toString(data) +
                ", size = " + size +
                "}";
    }

    public static void main(String[] args) {
        CustomArrayListUsingGenerics<Integer> list = new CustomArrayListUsingGenerics<>();
        list.add(11);
        list.add(22);
        list.add(33);

        System.out.println(list);
        list.remove();
        list.get(2);
        list.size();
        list.set(0, 99);
        System.out.println(list);
    }
}