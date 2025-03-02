/*
 * Напишите метод, который принимает в качестве параметра любую
 * строку, например, "I like Java!!!". Распечатайте последний символ строки. Для
 * этого необходимо использовать метод String.charAt(). Проверьте, заканчивается
 * ли строка подстрокой "!!!". Для этого необходимо использовать String.endsWith().
 * Проверьте, начинается ли строка подстрокой "I like". Для этого необходимо
 * использовать метод String.startsWith(). Проверьте, содержит ли строка подстроку
 * "Java". Для этого необходимо использовать метод String.contains(). Найдите
 * позицию подстроки "Java" в строке "I like Java!!!". Замените все символы "а" на
 * "о". Преобразуйте строку к верхнему регистру. Преобразуйте строку к нижнему
 * регистру. Вырежьте строку "Java" c помощью метода String.substring().
 */

public class Main {
    public static void main(String[] args) {
        String str = "I like Java!!!";

        manipulateString(str);
    }

    public static void manipulateString(String str) {
        char lastChar = str.charAt(str.length() - 1);
        System.out.println("Последний символ: " + lastChar);

        boolean endsWithExclamation = str.endsWith("!!!");
        System.out.println("Строка заканчивается на '!!!': " + endsWithExclamation);

        boolean startsWithLike = str.startsWith("I like");
        System.out.println("Строка начинается с 'I like': " + startsWithLike);

        boolean containsJava = str.contains("Java");
        System.out.println("Строка содержит 'Java': " + containsJava);

        int positionOfJava = str.indexOf("Java");
        System.out.println("Позиция подстроки 'Java': " + positionOfJava);

        String replacedString = str.replace('a', 'o');
        System.out.println("После замены 'a' на 'o': " + replacedString);

        String upperCaseStr = str.toUpperCase();
        System.out.println("Верхний регистр: " + upperCaseStr);

        String lowerCaseStr = str.toLowerCase();
        System.out.println("Нижний регистр: " + lowerCaseStr);

        String substring = str.substring(positionOfJava, positionOfJava + "Java".length());
        System.out.println("Подстрока 'Java': " + substring);
    }
}
