package OOP3.Inheritance;

public class Main {
    public static void main(String[] args) {
        Box box = new Box(); // new object is created.
        System.out.println(box.length + " " + box.width + " " + box.height);

        Box box1 = new Box(12);
        System.out.println(box1.length + " " + box1.width + " " + box1.height);

        Box box2 = new Box(10,20,30);
        System.out.println(box2.length + " " + box2.width + " " + box2.height);

        BoxWeight box3 = new BoxWeight();
        System.out.println(box3);

        BoxWeight box4 = new BoxWeight(2, 3, 4, 8 );
        System.out.println(box4.height + " " + box4.weight);

        Box box5 = new BoxWeight(2, 4, 5, 8); // parent class referencing to child class.
        System.out.println(box5);

//        BoxWeight box6 = new Box(2, 4, 5); // child class ref.variable is pointed to a parent class constructor.
//        System.out.println(box6);
    }
}
/*
        Concepts:
        # When a parent class is pointing to the child class.
        # Here: box5 is a ref.variable and BoxWeight is an object.
        # The type of the reference variable is actually determines what to access, not the object!
        # Child class can access the variables in the parent class, But parent class can't access the variables in the child class.

        InLine 23, 24:
        # There are many variables in the parent and child class.
        # You are given access to variables that are in the Reference type(i.e BoxWeight). You should have access to the variables of it.
        # This also means, that the ones you are trying to access should be initialised.
        # But here, When the object type is of parent class. How will you call the constructor of child class. That is why error.

        Still if you don't get it:
        # BoxWeight box6 = new Box(2, 4, 5);
        # Read this line as Parent class(Box) accessing the child class variables.
        # For every other relations, You relate this!
*/