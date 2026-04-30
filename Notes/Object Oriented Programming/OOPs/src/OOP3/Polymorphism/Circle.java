package OOP3.Polymorphism;

// circle is the subclass of shapes

public class Circle extends Shapes {
    @Override
    void area() { // This will run when object of circle is created.
        System.out.println("Area is pi * R * R");
    }
}