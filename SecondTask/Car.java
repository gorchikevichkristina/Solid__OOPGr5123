package SecondTask;

/**
 * Класс для описания легковой машины
 * @author Developer Name
 * @version 1.0
 */
public class Car extends Vehicle {
    private static double speedLimit = 0.8;

    public Car(int maxSpeed, String type) {
        super(maxSpeed, type);
    }

    @Override
    public void setSpeedLimit(double speedLimit) {
        Car.speedLimit = speedLimit;
    }

    @Override
    public double getSpeedLimit() {
        return Car.speedLimit;
    }
}
