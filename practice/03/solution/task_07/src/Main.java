/*
 * Необходимо модифицировать предыдущие классы. Переопределить методы
 * для вывода всех полей.
 */

public class Main {
    public static void main(String[] args) {
        Kitten kitten = new Kitten(4.5, 3, "Барсик", 5, "08:00 AM");
        Kitten clonedKitten = new Kitten(kitten);

        kitten.displayInfo();
        clonedKitten.displayInfo();
    }
}
