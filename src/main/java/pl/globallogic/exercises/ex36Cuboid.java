package pl.globallogic.exercises;

public class ex36Cuboid extends ex36PoolArea {
    private double height;

    public ex36Cuboid(double width, double length, double height) {
        super(width, length);
        this.height = (height < 0) ? 0 : height;
    }

    public double getHeight() {
        return height;
    }

    public double getVolume() {
        return getArea() * height;
    }
}
