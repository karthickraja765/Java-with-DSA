import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception{
        Heap<Integer> heap = new Heap<>();
        heap.insert(34);
        heap.insert(45);
        heap.insert(12);
        heap.insert(30);
        heap.insert(24);
        heap.insert(16);
        heap.insert(20);
        heap.insert(38);

        System.out.println(heap.remove());

        ArrayList list = heap.heapSort();
        System.out.println(list);
    }
}