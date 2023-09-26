package ThiedTask;

/**
 * Класса для описания круга
 * @author Developer Name
 * @version 1.0
 */
public class Circle implements iFlatShape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return 2 * 3.14 * radius;
    }
}
