/*
 * Дан массив из N строк. Строки имеют произвольную длину. Строки
 * содержат слова, состоящие из произвольных символов, разделенные пробелами,
 * запятыми, точками, N<=10. Необходимо написать методы:
 * - сортировка строк массива по количеству слов в строке;
 * - вывод значения длин всех строк массива;
 * - вывод строки с i по j из массива;
 * - вывод номера строки с максимальной цифрой;
 * - удаление из i-ой строки всех заглавных букв;
 * - удаление из i-ой строки всех символов, которые не буквы и не цифры;
 * - вывод из i-ой строки всех слов, содержащих только цифры;
 * - вычисление суммы всех цифр i-ой строки;
 * - вывод из массива всех слов, содержащих только прописные буквы;
 * - вывод всех чисел из строк;
 * - удаление из строки части, заключенной между двумя символами, которые
 * вводятся (например, между скобками или между звездочками и т.п.);
 * - определение количества одинаковых строк в массиве;
 * - определение количества одинаковых слов (выводить слово и количество
 * повторений);
 * - объединение в одну строку подстрок с i по j;
 * - преобразование i-ой строки так, чтобы все слова начинались с заглавной
 * буквы;
 * - внесение изменения в i-ую строку (предается номер строки и новое
 * содержание).
 */

public class Main {
    public static void main(String[] args) {
        String[] arr = {
                "Hello, world!",
                "Java is fun.",
                "123 456 789",
                "This is a test string with numbers 42 and 99.",
                "ALL CAPS WORDS"
        };

        // Сортировка строк массива по количеству слов в строке
        System.out.println("Sorted by word count:");
        sortByWordCount(arr);
        for (String str : arr) {
            System.out.println(str);
        }

        // Вывод значения длин всех строк массива
        System.out.println("\nString lengths:");
        printLengths(arr);

        // Вывод строки с i по j из массива
        System.out.println("\nSubarray from 1 to 3:");
        printSubArray(arr, 1, 3);

        // Вывод номера строки с максимальной цифрой
        System.out.println("\nLine with max digit: " + lineWithMaxDigit(arr));

        // Удаление из i-ой строки всех заглавных букв
        System.out.println("\nRemoving uppercase from second string: " + removeUpperCase(arr[1]));

        // Удаление из i-ой строки всех символов, которые не буквы и не цифры
        System.out.println("\nRemoving non-alphanumeric characters from third string: " + removeNonAlphanumeric(arr[2]));

        // Вывод из i-ой строки всех слов, содержащих только цифры
        System.out.println("\nDigit words in fourth string:");
        printDigitWords(arr[4]);

        // Вычисление суммы всех цифр i-ой строки
        System.out.println("\nSum of digits in fourth string: " + sumDigits(arr[4]));

        // Вывод из массива всех слов, содержащих только прописные буквы
        System.out.println("\nUppercase words in array:");
        printUpperCaseWords(arr);

        // Вывод всех чисел из строк
        System.out.println("\nAll numbers in array:");
        printAllNumbers(arr);
    }

    // Сортировка строк массива по количеству слов в строке
    private static void sortByWordCount(String[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (countWords(arr[j]) > countWords(arr[j + 1])) {
                    String temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    private static int countWords(String str) {
        return str.split("[ ,\\.]+").length;
    }

    // Вывод значения длин всех строк массива
    private static void printLengths(String[] arr) {
        for (String str : arr) {
            System.out.println(str.length());
        }
    }

    // Вывод строки с i по j из массива
    private static void printSubArray(String[] arr, int i, int j) {
        for (int k = i; k <= j && k < arr.length; k++) {
            System.out.println(arr[k]);
        }
    }

    // Вывод номера строки с максимальной цифрой
    private static int lineWithMaxDigit(String[] arr) {
        int max = -1;
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            for (char c : arr[i].toCharArray()) {
                if (Character.isDigit(c) && (c - '0') > max) {
                    max = c - '0'; // c - '0' - это превращение в число
                    index = i;
                }
            }
        }
        return index;
    }

    // Удаление из i-ой строки всех заглавных букв
    private static String removeUpperCase(String str) {
        return str.replaceAll("[A-Z]", "");
    }

    // Удаление из i-ой строки всех символов, которые не буквы и не цифры
    private static String removeNonAlphanumeric(String str) {
        return str.replaceAll("[^a-zA-Z0-9]", "");
    }

    // Вывод из i-ой строки всех слов, содержащих только цифры
    private static void printDigitWords(String str) {
        for (String word : str.split("[ ,\\.]+")) {
            if (word.matches("\\d+")) {
                System.out.println(word);
            }
        }
    }

    // Вычисление суммы всех цифр i-ой строки
    private static int sumDigits(String str) {
        int sum = 0;
        for (char c : str.toCharArray()) {
            if (Character.isDigit(c)) {
                sum += c - '0';
            }
        }
        return sum;
    }

    // Вывод из массива всех слов, содержащих только прописные буквы
    private static void printUpperCaseWords(String[] arr) {
        for (String str : arr) {
            for (String word : str.split("[ ,\\.]+")) {
                if (word.matches("[A-Z]+")) {
                    System.out.println(word);
                }
            }
        }
    }

    // Вывод всех чисел из строк
    private static void printAllNumbers(String[] arr) {
        for (String str : arr) {
            // Разбиваем строку по любым символам, которые не цифры
            for (String num : str.split("[^0-9]+")) {
                if (!num.isEmpty()) {
                    System.out.println(num);
                }
            }
        }
    }
}
