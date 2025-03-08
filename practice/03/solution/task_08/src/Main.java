/*
 * Необходимо модифицировать предыдущие классы. Создать класс "Собака",
 * который наследуется от класса "Животные". В классы "Собака" и "Кот" добавить
 * метод голос. В классе "Животные" этот метод должен быть объявлен как
 * абстрактный.
 */

public class Main {
    public static void main(String[] args) {
        Kitten kitten = new Kitten(4.5, 3, "Барсик", 5, "08:00 AM");
        Kitten clonedKitten = new Kitten(kitten);
        Dog dog = new Dog(10.0, 5, "Шарик", "Лабрадор");

        kitten.displayInfo();
        clonedKitten.displayInfo();
        dog.displayInfo();
        kitten.makeSound();
        dog.makeSound();
    }
}
