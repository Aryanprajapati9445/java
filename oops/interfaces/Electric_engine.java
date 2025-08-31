package interfaces;

public class Electric_engine implements engine {
    @Override
    public void start() {
        System.out.println("Electric engine is starting");
    }

    @Override
    public void stop() {
        System.out.println("Electric engine is stopping");
    }

    @Override
    public void accelerate(int speed) {
        System.out.println("Electric engine is accelerating to " + speed + " km/h");
    }
}
