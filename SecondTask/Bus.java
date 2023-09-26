package SecondTask;

/**
 * Класс для оипсания автобуса
 * @author Developer Name
 * @version 1.0
 */
public class Bus extends Vehicle {
    private static double speedLimit = 0.6;

    public Bus(int maxSpeed, String type) {
        super(maxSpeed, type);
    }

    @Override
    public void setSpeedLimit(double speedLimit) {
        Bus.speedLimit = speedLimit;
    }

    @Override
    public double getSpeedLimit() {
        return Bus.speedLimit;
    }
}