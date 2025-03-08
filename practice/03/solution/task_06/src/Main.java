/*
 * Необходимо модифицировать предыдущие классы. Добавить во все классы
 * конструкторы, параметрами которых является объект.
 */

public class Main {
    public static void main(String[] args) {
        Kitten kitten = new Kitten(4.5, 3, "Барсик", 5, "08:00 AM");
        Kitten clonedKitten = new Kitten(kitten);

        kitten.displayInfo();
        clonedKitten.displayInfo();
    }
}
