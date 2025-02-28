/*
 * Необходимо написать перегруженный метод для расчета площади фигуры.
 * Расчет площади квадрата – передается один параметр типа double; круга – один
 * параметр типа int; прямоугольника – два параметра типа double.
 */

import static java.lang.Math.PI;

public class Main {
    public static void main(String[] args) {
        System.out.println("Площадь квадрата со стороной равной 4,5: " + calculateShapeArea(4.5)
                + "\nПлощадь круга с радиусом равным 3: " + calculateShapeArea(3)
                + "\nПлощадь прямоугольника с длинной и шириной равными 3,2 и 4 соответственно: "
                + calculateShapeArea(3.2, 4));
    }

    static double calculateShapeArea(double squareSide) {
        return squareSide * squareSide;
    }

    static double calculateShapeArea(int circleRadius) {
        return PI * circleRadius * circleRadius;
    }

    static double calculateShapeArea(double rectangleLength, double rectangleWidth) {
        return rectangleLength * rectangleWidth;
    }
}
