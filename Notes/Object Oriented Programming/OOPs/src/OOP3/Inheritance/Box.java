package OOP3.Inheritance;

// superclass / parent class

public class Box {
    double length;
    double width;
    double height;

    Box() { // default constructor
        super(); // it points to the object class (Main)
        this.length = -1;
        this.width = -1;
        this.height = -1;
    }

    Box(double side) {
        this.length = side;
        this.width = side;
        this.height = side;
    }

    Box(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    Box(Box old) { // passing an argument with a custom datatype Box
        this.length = old.length;
        this.width = old.width;
        this.height = old.height;
    }

    public void information() { // Method
        System.out.println("Running the box");
    }
}