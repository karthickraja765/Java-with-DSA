class Student {
    // This is the Student class (used in OOPsBasics)
    // every single student in Student[] will have these three properties
    int roll;
    String name;
    float mark;

    void greeting() {
        System.out.println("Hello! My name is " + name); //Now the name is changed, It prints: Hello! My name is Satoru
    }
    void changeName(String newName){
        this.name = newName; // original name "Alex" is overridden by new name "Josh"
        System.out.println("My new name is now " + newName);
    }

    /*
    * If u have 100 entries, it is tedious to do the Below method. so, you can do it using constructor.
    * Concept: We need a way to add the values of the above properties(roll, name, marks) object by object.
    * So we need one word to access every object(Alex, William, Thomas)
    * "this" keyword. It basically replaces with the name of the reference variable.
    * If the constructor call has no arguments then Student() constructor will run.
    * If there is arguments then the particular constructor will run.
    * This is called as Constructor overloading.
    */

    Student(Student other) {  // Student constructor with one argument.
        this.roll = other.roll;
        this.name = other.name;
        this.mark = other.mark;
    }
    Student() {  // Student constructor with no arguments. This is called Default constructor
        this.roll = 30;
        this.name = "Thomas";
        this.mark = 90.2f;
        /*
         * This is the example of calling a constructor from a constructor. This line is called from a Student class, random2 variable
         * this(45, "Default person", 100.0f); // Run this line and check
         * Internally: It calls like : new Student(45, "Default person", 100.0f);
         */
    }
    Student(int rollll, String nameee, float markkk) {
        /*
        -> reference variables can be named same as the class property initialisation.
        -> You can also remove this keyword in the below and keeping the same variables as the arguments. Like this.
         roll = rollll;
         name = nameee;
         mark = markkk;

        -> This is known as polymorphism.
        */
        this.roll = rollll;
        this.name = nameee;
        this.mark = markkk;
    }
}