/*
 * Разработайте класс "Склад", имеющий два поля (количество единиц
 * товара, стоимость одной единицы). Определите в классе конструктор без
 * параметров и конструктор с двумя параметрами. Напишите метод позволяющий
 * изменять количество товара. Напишите метод позволяющий изменять стоимость
 * товара. Напишите метод позволяющий рассчитывать стоимость товара.
 * Напишите метод для сравнения стоимости товаров. Напишите метод с
 * переменным числом параметров определяющий общее количество товаров.
 */

public class Main {
    public static void main(String[] args) {
        Warehouse warehouse1 = new Warehouse(100, 5.0);
        Warehouse warehouse2 = new Warehouse(200, 4.0);
        Warehouse warehouse3 = new Warehouse();

        warehouse3.setQuantity(300);
        warehouse3.setPricePerUnit(6.0);

        int totalQuantity = Warehouse.totalQuantity(warehouse1, warehouse2, warehouse3);

        System.out.println("Общая стоимость склада 1: " + warehouse1.calculateTotalCost());
        System.out.println("Общая стоимость склада 2: " + warehouse2.calculateTotalCost());
        System.out.println("Общая стоимость склада 3: " + warehouse3.calculateTotalCost());
        System.out.println("Склад 1 дороже склада 2? " + warehouse1.isMoreExpensiveThan(warehouse2));
        System.out.println("Общее количество товаров на всех складах: " + totalQuantity);
    }
}
