package OOP5.Interfaces;

public class CompleteCar {
    private Engine engine;

    private Media player = new CDplayer(); // parent class(Media) is referring to child class(Cd player)

    public CompleteCar() {
        engine = new PowerEngine();
    }

    public CompleteCar(Engine engine) { // own engine
        this.engine = engine;
    }

    public void start() {
        engine.start();
    }

    public void stop() {
        engine.stop();
    }

    public void StartMusic() {
       player.start();
    }

    public void StopMusic() {
        player.stop();
    }

    public void ChangeEngine() { // change engine
        this.engine = new ElectricEngine();
    }
}