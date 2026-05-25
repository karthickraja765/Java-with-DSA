package OOP5.Interfaces;

public class PowerEngine implements Engine {

    @Override
    public void start() {
        System.out.println("Power Engine starts");
    }

    @Override
    public void stop() {
        System.out.println("Power Engine stops");
    }

    @Override
    public void accelerate() {
        System.out.println("Power Engine accelerates");
    }
}