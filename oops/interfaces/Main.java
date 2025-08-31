package interfaces;

public class Main {
public static void main(String[] args) {
   car c = new car(new Power_engine());
   c.start();
   c.stop();
   c.startmusic();
   c.stopmusic();
}
}
