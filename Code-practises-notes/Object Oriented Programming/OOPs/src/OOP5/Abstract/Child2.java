package OOP5.Abstract;

public class Child2 extends Parent {
    public Child2(int age) {
        super(age);
        this.age = age;
    }

    @Override
    void partner() {
        System.out.println("I love my dog");
    }

    @Override
    void carrer() {
        System.out.println("I like doctor");
    }
}