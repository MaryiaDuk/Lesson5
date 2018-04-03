package task1;

public class Rectangle extends Figure{
    private int sideA;
    private int sideB;
    public Rectangle(int sideA, int sideB){
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public double getArea() {
        return sideA*sideB;
    }
}
