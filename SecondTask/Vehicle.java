package SecondTask;

/**
 * Класс для описания транспортного средства
 *
 * @author Developer Name
 * @version 1.0
 */
public abstract class Vehicle {
    protected int maxSpeed;
    protected String type;
    /**
     * Конструктор класса
     *
     * @param maxSpeed максимальная скорость транспортного средства
     * @param type     тип транспортного средства
     */
    public Vehicle(int maxSpeed, String type) {
        this.maxSpeed = maxSpeed;
        this.type = type;
    }

    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getSpeedLimit() {
        return 0.0;
    }

    public void setSpeedLimit(double speedLimit) {
    }
}
