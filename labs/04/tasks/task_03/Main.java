/**
 * Напишите класс, который копирует содержимое из одного файла в
 * другой. Необходимо использовать классы BufferedReader, FileReader,
 * BufferedWriter, FileWriter. С помощью javadoc выполните документирование кода.
 */

package tasks.task_03;

import java.io.IOException;

/**
 * Демонстрационный класс для копирования файлов с использованием FileCopier.
 * <p>
 * Содержит примеры вызова методов копирования с разными параметрами.
 * </p>
 */
public class Main {
    /**
     * Основной метод, выполняющий копирование файлов и обработку ошибок.
     *
     * @param args Аргументы командной строки (не используются)
     */
    public static void main(String[] args) {
        try {
            final String BASE_PATH = "tasks/task_03/";

            // Примеры использования
            FileCopier.copy(BASE_PATH + "source.txt", BASE_PATH + "destination.txt");
            FileCopier.copy(BASE_PATH + "data.csv", BASE_PATH + "backup.csv", 16384);

            System.out.println("Files copied successfully");
        } catch (IOException e) {
            System.err.println("File copying error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
