import java.util.Arrays;

public class OOPsBasics {
    public static void main(String[] args) {
        int[] roll = {2, 4, 6, 8, 10};  // storing 5 Students roll numbers
        String[] name = new String[5];  // storing 5 Students names
        float[] mark = new float[5]; // storing 5 Students marks

        // can't we just store all the students details in a single code? Ans -> using objects and classes

        Student[] student = new Student[5]; // we create our own datatype called Student[] and store it

        System.out.println("------------------------------------------------------------------");

        Student John; // declaring a student named John
        System.out.println(Arrays.toString(student)); // prints: [null,null,null,null,null]
        // Reason: If u just initialised and try to print it then it will print null for all 5 students

        System.out.println("------------------------------------------------------------------");

        // Example of basic object declaration and initialisation
        Student Alex; // declare reference to object, Alex is a reference of type Student and Student is a class
        Alex = new Student(14, "Alex", 88.32f); // creating and allocating an object using new

        Student student1 = new Student(7, "William", 99.8f);
        System.out.println(student1.name); // prints: William

        Student student2 = new Student(); // calls the default constructor
        System.out.println(student2.name); // prints: Thomas

        System.out.println("------------------------------------------------------------------");

        // Example of Both references pointing to a same object
        Student one = new Student();
        Student two = one;

        one.name = "Ava";
        System.out.println(two.name); // prints: Ava

        System.out.println("------------------------------------------------------------------");

        Alex.changeName("Josh"); // the original name "Alex" is overridden and now points to "Josh"
        Alex.greeting(); // Now Greeting uses the new name in its body. Since, It's changed.

        System.out.println("------------------------------------------------------------------");

        System.out.println(Alex); //Prints some random value
        System.out.println(Alex.roll); // Prints 0 by default when it's not initialised.
        System.out.println(Alex.name); // Prints null by default when it's not initialised.
        System.out.println(Alex.mark); // Prints 0.0 by default when it's not initialised.
        System.out.println("------------------------------");

        /*
        * So in case you didn't create a value, that default value u mentioned in class will be printed.
        * you can also put some default value in the Class student template itself. Like this.
        student.roll = 30;
        student.name = "Luna";
        student.mark = 90.2f;

        * you can't declare a variable that is not in the class student template. For example,
        student.salary = 2000000;
        * Because salary does not exist in class student. Also because of Non-static conditions u can't.
        */
    }
}