package OOP3.Polymorphism;

// Example to show Runtime/Dynamic polymorphism - Method override

public class ObjectPrint { // by default every class extends object class
    int num;

    public ObjectPrint(int num) { // creating a constructor
        this.num = num;
    }
    @Override
    public String toString() {
        return "Number is " + num;
    }

    public static void main(String[] args) {
        ObjectPrint number = new ObjectPrint(54);
        System.out.println(number);  // This line prints OOP3.Polymorphism.ObjectPrint@27716f4 (Without toString method)
    }
}
/*
Concept:
* Because default obj.toString method is called by taking only object as a parameter.
* The object we pass does not have a toString method. So, Define your own to string.
* After providing toString method, At Run time, it will decide that toString method should run.
*/