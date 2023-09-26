package SecondTask;

/**
 * Класс для расчета разрешенной скорости двиежния транспорта
 * @author Developer Name
 * @version 1.0
 */
public class SpeedCalculation {
    public double calculateAllowedSpeed(Vehicle vehicle) {
        return vehicle.maxSpeed * vehicle.getSpeedLimit();
    }
}