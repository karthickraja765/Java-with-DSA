package OOP5.Abstract;

// Abstract class :An abstract class in Java is a class that cannot be instantiated and is intended to be extended by other classes.
// It provides a partial abstraction: some behavior is defined, and some is left for subclasses to implement.

public abstract class Parent { // we need to specify this here
    int age; // you can also add variables
    final int VALUE;

    public Parent(int age) { // constructor
        this.age = age;
        VALUE = 37915;
    }

    // Example of creating static method in an abstract class
    static void hello() {
        System.out.println("This is a normal Static method");
    }

    // Example of creating non-static method in an abstract class
    void normal() {
        System.out.println("This is a normal Non-static method");
    }

    // Abstract class
    abstract void carrer();
    abstract void partner();
}