package OOP3.Inheritance;

// subclass of BoxWeight

public class BoxPrice extends BoxWeight{
    double cost;

    BoxPrice() { // default constructor
        super(); // calls the default constructor of BoxWeight
        this.cost = -1;
    }
    BoxPrice(BoxPrice other) { // passing an argument with a custom datatype BoxPrice
        super(other); // calls BoxWeight oldBox
        this.cost = other.cost;
    }

    public BoxPrice(double length, double width, double height, double weight, double cost) {
        super(length, width, height, weight);
        this.cost = cost;
    }

    public BoxPrice(double side, double weight, double cost) {
        super(side, weight);
        this.cost = cost;
    }
}