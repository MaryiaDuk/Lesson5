package task1;

public class Square extends Figure {

    private int sideOfSquare;

    public Square(int sideOfSquare) {
        this.sideOfSquare = sideOfSquare;
    }

    @Override
    public double getArea() {
        return Math.pow(sideOfSquare,2);
    }
}
