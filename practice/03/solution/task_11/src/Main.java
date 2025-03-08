/*
 * Необходимо создать интерфейс Cookable, содержащий метод void
 * cook(String str). Создать класс Food, содержащий метод public void
 * prepare(Cookable c, String str) { c.cook(str); }. Создать экземпляр класса Food и
 * вызвать его метод prepare(). На вход метода prepare() передать экземпляр
 * анонимного класса, расширяющего интерфейс Cookable.
 */

public class Main {
    public static void main(String[] args) {
        Food food = new Food();

        food.prepare(new Cookable() {
            @Override
            public void cook(String str) {
                System.out.println("Готовится блюдо: " + str);
            }
        }, "Пицца");
    }
}
