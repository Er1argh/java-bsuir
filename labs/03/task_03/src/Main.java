/*
 * Создайте абстрактный класс "Фрукт" и классы "Яблоко", "Груша", "Слива"
 * расширяющие его. Класс "Фрукт" должен содержать: поле – вес, завершенный
 * метод printManufacturerInfo(){System.out.print("Made in RB");}, абстрактный
 * метод, возвращающий стоимость фрукта, который должен быть переопределен в
 * каждом классе наследнике. Метод должен учитывать вес фрукта. Создайте
 * несколько объектов разных классов. Подсчитайте общую стоимость проданных
 * фруктов. А также общую стоимость отдельно проданных яблок, груш и слив.
 */

public class Main {
    public static void main(String[] args) {
        Fruit[] fruits = {
                new Apple(1.5), new Apple(2.0),
                new Pear(1.2), new Pear(1.8),
                new Plum(0.8), new Plum(1.5)
        };
        double totalCost = 0;
        double applesCost = 0;
        double pearsCost = 0;
        double plumsCost = 0;

        for (Fruit fruit : fruits) {
            double price = fruit.getPrice();
            totalCost += price;

            if (fruit instanceof Apple) {
                applesCost += price;
            } else if (fruit instanceof Pear) {
                pearsCost += price;
            } else if (fruit instanceof Plum) {
                plumsCost += price;
            }
        }

        System.out.println("Общая стоимость всех фруктов: " + totalCost + " руб.");
        System.out.println("Общая стоимость яблок: " + applesCost + " руб.");
        System.out.println("Общая стоимость груш: " + pearsCost + " руб.");
        System.out.println("Общая стоимость слив: " + plumsCost + " руб.");
    }
}
