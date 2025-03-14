/*
 * Определите интерфейс Printable, содержащий метод void print().
 * Определить класс Book, реализующий интерфейс Printable. Определите класс
 * Magazine, реализующий интерфейс Printable. Создайте массив типа Printable,
 * который будет содержать книги и журналы. В цикле необходимо пройти по
 * массиву и вызвать метод print() для каждого объекта. Создайте статический
 * метод printMagazines(Printable[] printable) в классе Magazine, который будет
 * выводить на консоль названия только журналов. Создайте статический метод
 * printBooks(Printable[] printable) в классе Book, который будет выводить на
 * консоль названия только книг. Используйте оператор instanceof.
 */

public class Main {
    public static void main(String[] args) {
        Printable[] printables = {
                new Book("Java для начинающих"),
                new Magazine("Наука и техника"),
                new Book("Паттерны проектирования"),
                new Magazine("Мир моды")
        };

        System.out.println("Все издания:");

        for (Printable item : printables) {
            item.print();
        }

        System.out.println("\nСписок журналов:");
        Magazine.printMagazines(printables);
        
        System.out.println("\nСписок книг:");
        Book.printBooks(printables);
    }
}
