package task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String str = "Площадь фигуры равна: ";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сторону квадрата:");
        Figure square = new Square(scanner.nextInt());
        System.out.println(str + square.getArea());
        System.out.println("Введите радиус круга:");
        Figure circle = new Circle(scanner.nextDouble());
        System.out.println(str + circle.getArea());
        System.out.println("Введите стороны треугольника: ");
        Figure triangle = new Triangle(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
        System.out.println(str + triangle.getArea());
        System.out.println("Введите стороны прямоугольника:");
        Figure rectangle = new Rectangle(scanner.nextInt(), scanner.nextInt());
        System.out.println(str + rectangle.getArea());
    }
}
