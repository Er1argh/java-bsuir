/*
 * Необходимо модифицировать предыдущие классы. Добавить конструктор в
 * класс "Животные". Внести изменения в класс "Кот" для использования
 * выражения super().
 */

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat(4.5, 3, "Барсик", 5);

        cat.displayInfo();
    }
}
