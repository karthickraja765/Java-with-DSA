package OOP3.Polymorphism;

// triangle is the subclass of shapes

public class Triangle extends Shapes {
    @Override
    void area() {
        System.out.println("Area is 0.5 * B * H ");
    }
}