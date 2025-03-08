/*
 * Необходимо к предыдущим классам добавить класс "Котенок" (потомок
 * класса "Кот") с полем время кормления.
 */

public class Main {
    public static void main(String[] args) {
        Kitten kitten = new Kitten(4.5, 3, "Барсик", 5, "08:00 AM");

        kitten.displayInfo();
    }
}
