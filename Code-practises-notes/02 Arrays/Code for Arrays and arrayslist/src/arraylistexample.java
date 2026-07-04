import java.util.ArrayList;
import java.util.Scanner;

public class arraylistexample {
    public static void main(String[] args) {
        //syntax of array list
        ArrayList<Integer> list = new ArrayList<>(10);
//        list.add(12);
//        list.add(32);
//        list.add(142);
//        list.add(1223);
//        list.add(1221222212);
//
//        System.out.println(list.contains(142));
//
//        System.out.println(list);
//        list.set(1, 99);
//        System.out.println(list);
//        list.remove(4);
//        System.out.println(list);
//        System.out.println(list.get(3));


        Scanner in = new Scanner(System.in);
        // we can use for-loop to this.
        for (int i = 0; i < 5; i++) {
            int a  = in.nextInt();
            list.add(a); // or in.nextInt(list.add());
        }
        System.out.println(list);
    }
}
