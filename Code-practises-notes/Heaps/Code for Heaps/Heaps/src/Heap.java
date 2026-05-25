import java.util.ArrayList;

public class Heap <T extends Comparable<T>> {
    private ArrayList<T> list;

    public Heap() { // constructor
        list = new ArrayList<>(); // creating a new arraylist whenever the constructor is being called
    }

    public void swap(int first, int second) {
        T temp = list.get(first);
        list.set(first, list.get(second)); // get second and set it in first
        list.set(second, temp);
    }

    // parent = i / 2 (for index starting from 1)
    public int parent(int index) {
        return (index - 1) / 2;
    }

    // left = 2 * i (for index starting from 1)
    public int left(int index) {
        return index * 2 + 1;
    }

    // right = 2 * i + 1 (for index starting from 1)
    public int right(int index) {
        return index * 2 + 2;
    }

    public void insert(T value) {
        list.add(value); // add the value as usual to the ArrayList
        upHeap(list.size() - 1); // call upheap for the last value u just added
    }

    private void upHeap(int index) {
        if (index == 0) return; // Base condition: if you're the 0th index, just return
        int p = parent(index); // get the parent index value
        if (list.get(index).compareTo(list.get(p)) < 0) { // check if the value is smaller than the parent, swap
            swap(index, p);
            upHeap(p);
        }
    }

    public T remove() throws Exception {
        if (list.isEmpty()) {
            throw new Exception("Cannot remove from the empty heap");
        }
        // concept: remove the first element and put the last element in the first place and sort it.
        T temp = list.get(0);
        T last = list.remove(list.size() - 1);
        if (!list.isEmpty()) {
            list.set(0, last);
            downHeap(0);
        }
        return temp;
    }

    private void downHeap(int index) {
        int min = index;
        int left = left(index);
        int right = right(index);

        if (left < list.size() && list.get(min).compareTo(list.get(left)) > 0) {
            min = left;
        }
        if (right < list.size() && list.get(min).compareTo(list.get(right)) > 0) {
            min = right;
        }
        if (min != index) {
            swap(min, index);
            downHeap(min);
        }
    }

    // This will be used in priority heapSort
    public ArrayList<T> heapSort() throws Exception {
        ArrayList<T> data = new ArrayList<>();
        while (!list.isEmpty()) {
            data.add(this.remove());
        }
        return data;
    }
}