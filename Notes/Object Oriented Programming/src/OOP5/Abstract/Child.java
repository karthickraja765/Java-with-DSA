package OOP5.Abstract;

public class Child extends Parent {
    public Child(int age) { // constructor
        super(age);
        this.age = age;
    }

    @Override
    void normal() {
        super.normal();
    }

    @Override
    void partner() {
        System.out.println("I love my cat");
    }

    @Override
    void carrer() {
        System.out.println("I like coding");
    }
}