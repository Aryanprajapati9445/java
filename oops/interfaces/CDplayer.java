package interfaces;

public class CDplayer implements media {
    @Override
    public void start() {
        System.out.println("CD player is starting");
    }

    @Override
    public void stop() {
        System.out.println("CD player is stopping");
    }
    
    public void playCD() {
        System.out.println("Playing CD");
    }
    
    public void pauseCD() {
        System.out.println("Pausing CD");
    }

}
