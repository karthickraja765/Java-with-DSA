import jdk.dynalink.beans.StaticClass;

import java.lang.reflect.Array;
import java.util.Arrays;

public class variablelenghtarguments {
    public static void main(String[] args) {
        funny(2,54,234,23,342,423,23,12);
        multiple( 21,23, "kae", "aka", "karthick", "raja");
    }
// u cannot use string...v at the middle of initailsation.
    static void multiple(int a, int b, String...v){
        System.out.println(Arrays.toString(v));
    }

    static void funny(int...v){
        System.out.println(Arrays.toString(v));
    }
}
