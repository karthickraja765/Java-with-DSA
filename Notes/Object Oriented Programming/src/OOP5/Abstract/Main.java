package OOP5.Abstract;

public class Main {
    public static void main(String[] args) {
        Child son = new Child(20);
        son.carrer(); // prints: I like coding
        son.partner(); // Prints: I love my cat
        System.out.println(son.age); // prints: 20
        son.normal(); // prints: This is a normal Non-static method
        System.out.println(son.VALUE); //Prints: 37915

        System.out.println("------------------------------------------------------------------");

        Parent daughter = new Child2(18); // instead of Child2; you can also use Super class name as the Ref Type (Parent).
        daughter.carrer(); // prints: I like doctor
        System.out.println(daughter.age); // prints: 18
        daughter.partner(); // prints: I love my dog

        System.out.println("------------------------------------------------------------------");

        Parent mom = new Parent(48) { // You can not create object of abstract classes after creating a constructor for parent (like this). But you can override it here. Like this (Below).
            @Override
            void carrer() {
            }
            @Override
            void partner() {
            }
        };
        System.out.println(mom.age); // prints 48
        System.out.println(mom.VALUE); // prints : 37915

        System.out.println("------------------------------------------------------------------");

        Parent.hello();
    }
}