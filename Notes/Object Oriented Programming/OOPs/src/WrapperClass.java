public class WrapperClass {
    // these classes allow primitive datatype to be represented as objects. Such as Integer, Long, Float, String, Byte, Short, Boolean, Char.
    public static void main(String[] args) {
        // here a and b are just Reference variables that will store values in integer format
        int a = 10;
        int b = 20;
        Integer numA = 50;  // here numA is a Reference variable of object of type Integer. Also, num has some functions in it. Try to do numA.;
        Integer numB = 100;

        swap(a, b); // it wont swap!
        System.out.println(a + " " + b);

        // representation of final keyword
        final int INC = 2; // you can not modify this like: INC = 10;

        // creating new object using final
        final Name Alex = new Name("Alex Green");
        Alex.name = "Alex Pink";
        // Alex = new A("new name"); // when a non-primitive is final you cannot reassign it. You cannot do this.

        Name object = new Name("Same name");
        System.out.println(object); // prints random value
        // println -> valueOf(Object obj) -> if there isn't a toString method. Then It will print the class-name-@-RandomHashvalue.

        // Demo for finalise method
        for (int i = 0; i < 10000; i++) {
            object = new Name("Random name");
        }
    }
    static void swap(int a , int b){
        int temp = a;
        a = b;
        b = temp;
    }
}

/*
public static void main(String[] args) {
        int a = 10;
        int b = 20;
        swap(a, b);
        System.out.println(a + " " + b);
    }
    static void swap(int a , int b){
        int temp = a;
        a = b;
        b = temp;
    }
    public static void main(String[] args) {
        Integer a = 10;  //Here these are objects and Ref.variables. So Here, it is pass by reference value.
        Integer b = 20;
        swap(a , b);
        System.out.println(a + " " + b);
    }
    static void swap(Integer a, Integer b){ // Same! It won't swap now also! Because of the final keyword!
        Integer temp = a;
        a = b;
        b = temp;
    }
* This above program if u run it, It won't swap!
* Because, In Java, Either in primitives and in general. There is only pass by value. No pass by reference.
* If u have doubt, Watch video 37 at 1h 25 minute
*/