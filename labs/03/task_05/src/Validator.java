public class Validator {
    public static boolean validate(String login, String password, String confirmPassword) {
        try {
            if (!login.matches("[a-zA-Z0-9_]+") || login.length() >= 20) {
                throw new WrongLoginException("Логин должен содержать только латинские буквы, цифры и знак подчеркивания, и быть короче 20 символов.");
            }

            if (!password.matches("[a-zA-Z0-9_]+") || password.length() >= 20) {
                throw new WrongPasswordException("Пароль должен содержать только латинские буквы, цифры и знак подчеркивания, и быть короче 20 символов.");
            }

            if (!password.equals(confirmPassword)) {
                throw new WrongPasswordException("Пароль и подтверждение пароля не совпадают.");
            }

            return true;
        } catch (WrongLoginException e) {
            System.out.println("Ошибка: " + e.getMessage());
        } catch (WrongPasswordException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

        return false;
    }
}
