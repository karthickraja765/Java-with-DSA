package OOP5.Interfaces;

public class CDplayer implements Media {

    @Override
    public void start() {
        System.out.println("Starts the music");
    }

    @Override
    public void stop() {
        System.out.println("Stops the music"); 
    }
}