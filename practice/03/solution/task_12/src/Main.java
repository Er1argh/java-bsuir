/*
 * Необходимо создать статический метод, который принимает на вход три
 * параметра: login, password и confirmPassword. login должен содержать только
 * латинские буквы, цифры и знак подчеркивания. Длина login должна быть меньше
 * 20 символов. Если login не соответствует этим требованиям, необходимо
 * выбросить WrongLoginException. password должен содержать только латинские
 * буквы, цифры и знак подчеркивания. Длина password должна быть меньше 20
 * символов. Также password и confirmPassword должны быть равны. Если password
 * не соответствует этим требованиям, необходимо выбросить
 * WrongPasswordException. WrongPasswordException и WrongLoginException –
 * пользовательские классы исключения с двумя конструкторами – один по
 * умолчанию, второй принимает сообщение исключения и передает его в
 * конструктор класса Exception. Обработка исключений проводится внутри метода.
 * Необходимо использовать несколько блоков catch. Метод возвращает true, если
 * значения верны или false в другом случае.
 */

public class Main {
    public static void main(String[] args) {
        System.out.println(Validator.validate("User_123", "Password_123", "Password_123")); // true
        System.out.println(Validator.validate("User 123", "Password_123", "Password_123")); // false (логин неверный)
        System.out.println(Validator.validate("User_123", "Pass@word_123", "Pass@word_123")); // false (пароль неверный)
        System.out.println(Validator.validate("User_123", "Password_123", "Password_124")); // false (пароли не совпадают)
    }
}
