/*
 * Необходимо создать класс User, содержащий private поля: логин, пароль.
 * Создать внутренний класс Query в классе User. Класс Query должен содержать
 * метод printToLog(), который распечатывает сообщение о том, что пользователь с
 * таким-то логином и паролем отправил запрос. Класс User, должен содержать
 * метод createQuery(), в котором создается объект класса Query и вызывается
 * метод printToLog(). В методе main(): создать экземпляр класса User и вызвать
 * метод createQuery(); создать экземпляр класса Query и вызвать метод
 * printToLog() используя конструкцию user.new Query(); создать экземпляр класса
 * Query и вызвать метод printToLog() используя конструкцию new User().new
 * Query().
 */

public class Main {
    public static void main(String[] args) {
        User user = new User("admin", "12345678");
        User.Query query1 = user.new Query();
        User.Query query2 = new User("guest", "87654321").new Query();

        user.createQuery();
        query1.printToLog();
        query2.printToLog();
    }
}
