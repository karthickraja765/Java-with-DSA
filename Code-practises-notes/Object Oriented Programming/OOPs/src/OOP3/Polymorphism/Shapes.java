package OOP3.Polymorphism;

// parent class

public class Shapes {
    void area() {
        System.out.println("I'm in Shapes");
    }

//    final void area() {
//        System.out.println("I'm in Shapes");
//    }
}

/*
Concept:
* you can put final in the method of superclass, when you want to prevent class and its methods from being inheriting.
* When you put a class as final, implicitly it declares all of its methods as final.
*/