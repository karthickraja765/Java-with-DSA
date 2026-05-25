package OOP5.Interfaces;

// to connect an interface you need to use implements
// to connect a class you need to use extends

public class Car implements Engine, Brake, Media{
    // In interface, we don't really need to initialise variables to create constructor
    @Override
    public void brake() {
        System.out.println("Stops the car");
    }

    @Override
    public void start() {
        System.out.println("Starts the Engine");
    }

    @Override
    public void stop() {
        System.out.println("Stops the Engine");
    }

    @Override
    public void accelerate() {
        System.out.println("Accelerates the Engine");
    }
}

/*
Concept:
* Interface contains abstract classes.
* Variables in the interface are static and final by convention.
* Abstract class provide implementation information about interfaces, Interfaces cannot provide implementation information to abstract class.
* class can connect multiple interfaces.
* Members of java interface are public by default.
*/