package OOP2.SingletonClass;

public class Singleton {
    private Singleton() { // private means the variable, classes and methods can be accessed within this file only!
        System.out.println("Instance One!");
    }
    private static Singleton instance; // Reference to the object Singleton is initialised. Initially it is null!

    @Override
    public String toString() {
        return "Singleton";
    }

    public static Singleton getInstance() { // Method to check the instances.
        if (instance == null) { // checking whether one object is created or not
            instance = new Singleton();
        }
        return instance;
    }
    public static void main(String[] args) {
        Singleton obj1 = Singleton.getInstance(); // The first object is created.

        Singleton obj2 = Singleton.getInstance();

        Singleton obj3 = Singleton.getInstance();

        System.out.println(obj1 + " " + obj2 + " " + obj3); // Here three Ref.variables pointing to the same object's address.
    }
}