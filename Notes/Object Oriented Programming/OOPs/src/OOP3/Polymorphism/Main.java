package OOP3.Polymorphism;

public class Main {
    public static void main(String[] args) {
        Shapes shape = new Shapes();
        Sqaure square = new Sqaure(); // object of square is created
        Circle circle = new Circle(); // object of circle is created

        shape.area(); // prints: I'm in Shapes. Because the concept is What variable it has access to, depends on the type of the Ref.Variable. That it checks whether area exists? Yes it does. So, It prints it.
        square.area(); // prints: 4 times a
        circle.area(); // prints: Area is pi * R * R

        Shapes triangle = new Triangle();  // superclass Ref variable can refer to subclass object. Fact!
        triangle.area(); // prints: Area is 0.5 * B * H
    }
}
/*
InLine: 14, 15 Concept:
* Parent class is the shapes and child class is triangle. Logically it should have the properties of parent class right? Why it is printing its own area()!
* What happens is that which particular method will be called depends on the object that the ref variable is referring to. This is known as upcasting.
* Object's base class is overridden by the main one (where the object is created).
* How Java knows which one to print? By Dynamic Method dispatch.
* It is a mechanism by which, call to an overridden method is resolved at runtime rather than compile time.
* All the compilation is done when the program is run. During that time, Java will determine which one to run.
* In other words, When a overridden method is called by the superclass ref variable, Java determines which version of that method to call based on the type of object(at the time of call happens).
  Hence, determines which one to run at runtime.
*/
