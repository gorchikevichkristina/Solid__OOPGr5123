package FifthTask;

/**
 * Класс для описания автомобиля
 * @author Developer Name
 * @version 1.0
 */
public class Car {
    private Engine engine;

    public Car(Engine engine) {
        this.engine = engine;
    }

    public void start() {
        this.engine.start();
    }
}
