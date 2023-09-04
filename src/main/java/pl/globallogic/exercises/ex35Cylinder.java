package pl.globallogic.exercises;

public class ex35Cylinder extends ex35Circle {
    private double height;
    public ex35Cylinder(double radius, double height) {
        super(radius);
        if (height < 0) {
            this.height = 0;
        } else {
            this.height = height;
        }
    }
    public double getHeight() {
        return height;
    }
    public double getVolume() {
        return getArea() * height;
    }
}


