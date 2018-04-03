package task1;

public class Circle extends Figure {
    private double radius;

    public Circle(double radius) {
    this.radius=radius;
    }

    @Override
    public double getArea() {
        double aria = Math.PI*Math.pow(radius,2);
        return aria;
    }
}
