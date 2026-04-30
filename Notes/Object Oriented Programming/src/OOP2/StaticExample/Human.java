package OOP2.StaticExample;

public class Human {
    // This is the Human class (used in Static)
    int age;
    String name;
    int salary;
    boolean married;

    static long population;

//    static void message() {
//        System.out.println("hello world");
//        System.out.println(this.age); // static members cannot use this or super keyword. Because this keyword basically represents object.
//    }

    Human() {
        System.out.println("Only one Boy");
    }

    Human(int age, String name, int salary, boolean married) {
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married;

        Human.population += 1; // If the above initialisation of population isn't static, you probably cannot do this thing.
    }
}