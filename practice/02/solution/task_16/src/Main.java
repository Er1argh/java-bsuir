/*
 * Необходимо написать класс для хранения информации о людях. Класс
 * должен содержать: конструктор для заполнения четырех полей с одним
 * параметром String, в котором через ; перечисляется имя, возраст, вес, рост
 * ("Alex; 45; 90; 185"). Метод, в который передается аналогичная строка ("Serg;
 * 25; 80; 180") и делается сравнение всех полей для данного объекта с данными
 */

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Alex; 45; 90; 185");

        person1.printInfo();
        System.out.println("Сравнение с другой строкой: " + person1.compare("Serg; 25; 80; 180"));

        person1.setName("John");
        person1.setAge(50);
        person1.setWeight(85);
        person1.setHeight(180);

        System.out.println("После изменений:");
        person1.printInfo();
    }
}
