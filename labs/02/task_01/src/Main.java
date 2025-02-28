/*
 * Разработайте класс "Круг", имеющий три поля (первое поле будет
 * хранить значение радиуса, два других поля координаты центра). Определите в
 * классе конструктор без параметров, конструктор с одним параметром – радиус,
 * конструктор с двумя параметрами – координаты центра, конструктор с тремя
 * параметрами – все три поля. Напишите метод выводящий все характеристики
 * круга. Напишите метод изменяющий координаты центра (передаются параметры,
 * указывающие на сколько нужно изменить координаты центра). Напишите метод
 * для изменения радиуса круга. Напишите метод для расчета площади круга и
 * метод для расчета длины окружности.
 */

public class Main {
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        Circle circle2 = new Circle(5.0);
        Circle circle3 = new Circle(2.0, 3.0);
        Circle circle4 = new Circle(4.5, 1.0, 2.0);

        System.out.println("Круг 1:");
        circle1.printCircleInfo();
        System.out.println();

        System.out.println("Круг 2:");
        circle2.printCircleInfo();
        System.out.println();

        System.out.println("Круг 3:");
        circle3.printCircleInfo();
        System.out.println();

        System.out.println("Круг 4:");
        circle4.printCircleInfo();
        System.out.println();

        circle4.moveCenter(3.0, -1.5);
        System.out.println("Круг 4 после изменения координат:");
        circle4.printCircleInfo();
        System.out.println();

        circle2.changeRadius(7.5);
        System.out.println("Круг 2 после изменения радиуса:");
        circle2.printCircleInfo();
    }
}
