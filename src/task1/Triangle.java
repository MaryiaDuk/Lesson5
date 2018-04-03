package task1;

public class Triangle extends Figure {
    private int sideA;
    private int sideB;
    private int sideC;
    private double S;
    public boolean exists;

    public Triangle(int sideA, int sideB, int sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public boolean ifExists(int sideA, int sideB, int sideC) {
        if ((sideA + sideB) > sideC && sideA + sideC > sideB && sideB + sideC > sideA) exists = true;
        else exists = false;
        return exists;
    }

    @Override
    public double getArea() {
        if (ifExists(sideA, sideB, sideC)) {
            double p;
            p = (sideA + sideB + sideC) / 2;
            double sqrt = p * (p - sideC) * (p - sideA) * (p - sideB);
            S = Math.sqrt(sqrt);
        } else {
            System.out.println("Треугольник с такими сторонами не существует");
        }
        return S;
    }
}