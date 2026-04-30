package OOP5.Interfaces;

public class Main {
    public static void main(String[] args) {
        Engine car = new Car();
        car.accelerate();
        car.start();
        car.stop();

        System.out.println("------------------------------------------------------------------");

        Media MediaCar = new Car();
        MediaCar.stop();

        System.out.println("------------------------------------------------------------------");

        CompleteCar rolls = new CompleteCar();
        rolls.start();
        rolls.stop();
        rolls.StartMusic();
        rolls.StopMusic();
        rolls.stop();
        rolls.ChangeEngine();
        rolls.start();

        System.out.println("------------------------------------------------------------------");
    }
}