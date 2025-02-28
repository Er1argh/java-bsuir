/*
 * Необходимо написать класс "Животные", содержаний поля – имя,
 * возраст, вес, рост. Объявить три константы: возраст, вес, рост в которые
 * записать пороговые значения. Создать несколько объектов класса. Написать
 * конструктор без параметров и конструктор с параметрами. Написать метод,
 * выводящий все данные о животном на консоль. Метод, определяющий
 * одинаковые ли имена у двух животных. Метод, сравнивающий поля объекта с
 * пороговыми значениями возраст, вес, рост (пример вывода: старше 5 лет; легче
 * 2 кг; выше 20 см).
 */

public class Main {
    public static void main(String[] args) {
        Animal animal1 = new Animal("Барсик", 6, 3.5, 25.0);
        Animal animal2 = new Animal("Мурка", 4, 1.8, 18.0);
        Animal animal3 = new Animal("Барсик", 7, 4.2, 30.0);

        animal1.printInfo();
        animal2.printInfo();
        animal3.printInfo();

        System.out.println("Одинаковые ли имена у animal1 и animal2? " + animal1.hasSameName(animal2));
        System.out.println("Одинаковые ли имена у animal1 и animal3? " + animal1.hasSameName(animal3));

        animal1.compareWithThresholds();
        animal2.compareWithThresholds();
        animal3.compareWithThresholds();
    }
}
