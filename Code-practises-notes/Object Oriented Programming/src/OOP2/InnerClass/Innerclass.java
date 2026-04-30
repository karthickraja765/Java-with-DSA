package OOP2.InnerClass;

public class Innerclass {
     static class Test { // If you have static here, It depends on the outer class, not dependent on its objects of the outer class. So Test and main can depend on each other since they are both static.
        String name; // Initially it contains null

        public Test(String name) { // constructor that takes a name
            this.name = name;
        }
        @Override
        public String toString() { // toString method is present so it won't print some random hash value.
             return name;
         }
     }

     public static void main(String[] args) {
        Test A = new Test("Bella");
        Test B = new Test("Luna");

        System.out.println(A);
        System.out.println(B);

        System.out.println(A.name);
        System.out.println(B.name);
     }
}

/*
* Outside the class, it cannot be static. Because it itself does not dependent on any other class.
* So you cannot put it as static.
* But inner class is dependent on outside class. Only Inner classes can be static.
* If you run static class Test block Below with or without toString outside the class, A.name and B.name will print Raja.
* Because Name is being replaced. So both the name will be same.
-x-
* You cant have a Non-static object that points to a static. Because the class Test itself is dependent on the outside class.
* Note: class Test will work fine when it is put outside. When it is put outside it does not depend on any class.
* So every instance of instance classes will have some class Test with it as well.
*/