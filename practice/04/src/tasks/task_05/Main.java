/**
 * Необходимо создать класс, который копирует содержимое из одного файла
 * в другой. Для этого нужно использовать классы BufferedReader, FileReader,
 * BufferedWriter, FileWriter.
 */

package tasks.task_05;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            String basePath = "src/tasks/task_05/";

            FileCopier.copy(basePath + "source.txt", basePath + "destination.txt");
            FileCopier.copy(basePath + "data.csv", basePath + "backup.csv", 16384);

            System.out.println("Файлы успешно скопированы");
        } catch (IOException e) {
            System.err.println("Ошибка копирования файлов: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
