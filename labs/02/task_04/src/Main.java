/*
 * Определите класс "Дробь" в виде пары (m, n). Класс должен содержать
 * несколько конструкторов. Реализуйте методы для сложения, вычитания,
 * умножения, деления и сокращения дробей. Методы для сложения и умножения
 * дробей сделайте с переменным числом параметров. Объявите массив из k
 * дробей, введите/выведите значения для массива дробей. Создайте массив
 * объектов и передайте его в метод, который будет изменять каждый элемент
 * массива с четным индексом путем добавления, следующего за ним элемента
 * массива.
 */

public class Main {
    public static void main(String[] args) {
        int k = 5;
        Fraction[] fractions = new Fraction[k];

        for (int i = 0; i < k; i++) {
            fractions[i] = new Fraction(i + 1, i + 2);
        }

        System.out.println("Исходный массив дробей:");

        for (Fraction f : fractions) {
            System.out.println(f);
        }

        modifyArray(fractions);

        System.out.println("Измененный массив дробей:");

        for (Fraction f : fractions) {
            System.out.println(f);
        }
    }

    public static void modifyArray(Fraction[] fractions) {
        for (int i = 0; i < fractions.length - 1; i += 2) {
            fractions[i] = Fraction.add(fractions[i], fractions[i + 1]);
        }
    }
}
