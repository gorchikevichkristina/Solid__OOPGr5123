package ThiedTask;


/**
 * Класса для описания куба
 * @author Developer Name
 * @version 1.0
 */
public class Cube implements iVolumetricShape, iFlatShape {
    private int edge;

    public Cube(int edge) {
        this.edge = edge;
    }

    @Override
    public double area() {
        return 6 * edge * edge;
    }

    @Override
    public double volume() {
        return edge * edge * edge;
    }
}