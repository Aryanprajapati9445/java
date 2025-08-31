package interfaces;

public class Power_engine implements engine{
    @Override
    public void start() {
        System.out.println("Power engine is starting");
    }

    @Override
    public void stop() {
        System.out.println("Power engine is stopping");
    }

    @Override
    public void accelerate(int speed) {
        System.out.println("Power engine is accelerating to " + speed + " km/h");
    }


}
