package OOP3.Polymorphism;

// Example to show compile/Static polymorphism - Method overloading
public class Numbers {
    double sum(double a, int b) { // Automatic type casting occurs. Even if u pass integer for a. It will convert it as per result so it is converted to double.
        return a + b; // returned as double.
    }

    int sum(int a, int b) {
        return a + b; //returned as int. Parameters are int.
    }
    int sum(int a, int b, int c) {
        return a + b + c; // parameters are different, returned as int.
    }

    public static void main(String[] args) {
        Numbers obj = new Numbers();
        // These Below lines will run during compile time.
        System.out.println(obj.sum(22.4f, 5));
        System.out.println(obj.sum(2, 3));
        System.out.println(obj.sum(2, 3, 5));
    }
}