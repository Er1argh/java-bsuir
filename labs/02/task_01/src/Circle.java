import static java.lang.Math.PI;

public class Circle {
    private double radius;
    private double x;
    private double y;

    public Circle() {
        this.radius = 1.0;
        this.x = 0.0;
        this.y = 0.0;
    }

    public Circle(double radius) {
        this.radius = radius;
        this.x = 0.0;
        this.y = 0.0;
    }

    public Circle(double x, double y) {
        this.radius = 1.0;
        this.x = x;
        this.y = y;
    }

    public Circle(double radius, double x, double y) {
        this.radius = radius;
        this.x = x;
        this.y = y;
    }

    public void printCircleInfo() {
        System.out.println("Радиус: " + radius);
        System.out.println("Центр: (" + x + ", " + y + ")");
        System.out.println("Площадь: " + calculateArea());
        System.out.println("Длина окружности: " + calculateCircumference());
    }

    public void moveCenter(double dx, double dy) {
        this.x += dx;
        this.y += dy;
    }

    public void changeRadius(double newRadius) {
        if (newRadius > 0) {
            this.radius = newRadius;
        } else {
            System.out.println("Радиус должен быть положительным");
        }
    }

    public double calculateArea() {
        return PI * radius * radius;
    }

    public double calculateCircumference() {
        return 2 * PI * radius;
    }
}
