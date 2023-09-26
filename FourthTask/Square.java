package FourthTask;

public class Square extends Rectangle {
    @Override
    public void setWidth(int edgeLength) {
        super.setWidth(edgeLength);
        super.setHeight(edgeLength);
    }

    @Override
    public void setHeight(int edgeLength) {
        super.setWidth(edgeLength);
        super.setHeight(edgeLength);
    }
}
