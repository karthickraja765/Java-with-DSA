import java.util.ArrayList;
import java.util.Scanner;

public class multiarraylist {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>(5);
        Scanner in = new Scanner(System.in);

        // initialisation part is done by creating 3 arrays
        for (int i = 0; i < 3; i++) {
            list.add(new ArrayList<>());
        }
        
        // adding elements
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                list.get(i).add(in.nextInt());  // get the arraylist at the index of ith place and add the element.
            }
        }
        System.out.println(list);
    }
}
