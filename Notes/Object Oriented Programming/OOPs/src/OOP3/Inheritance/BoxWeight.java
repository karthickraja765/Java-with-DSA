package OOP3.Inheritance;

// BoxWeight is the subclass of Box and superclass of BoxPrice

public class BoxWeight extends Box {
    double weight;

    public BoxWeight() { // default constructor
        this.weight = 1.23;
        System.out.println(weight);
    }

    BoxWeight (BoxWeight oldBox) { // passing an argument with a custom datatype BoxWeight
        super(oldBox);
        weight = oldBox.weight;
    }

    public BoxWeight(double side, double weight) {
        super(side);
        this.weight = weight ;
    }

    public BoxWeight(double length, double width, double height, double weight) {
        super(length, width, height); // What is super here? super calls the parent constructor by its parameters. Also Used to initialise values present in parent class.
        System.out.println(super.height); // prints the height of the superclass's base class. Here super is used when there is a variable that u want to access directly from the superclass's base class.

        this.weight = weight;
        // Example of second use case of Super Keyword
        System.out.println(this.weight);
    }
}

/*

Concepts:
* Parent class does not care what child class contains, But child class care what parent class contains.
* So parent class should be initialised first. that's why we call the parent constructor using super.
* InLine : super(length, width, height); If this line isn't called, then the default one will run.
* Suppose, In the parent class there is a variable called double weight; So when you print weight in the child class like this System.out.println(super.weight);
* It will print the weight that is the parent class. Though child class also has weight variable, it doesn't print it. It prints the one that is in parent class.

*/