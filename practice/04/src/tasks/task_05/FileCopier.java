package tasks.task_05;

import java.io.*;

public class FileCopier {
    private static final int DEFAULT_BUFFER_SIZE = 8192; // 16 KB

    public static void copy(String sourcePath, String targetPath) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(sourcePath));
             BufferedWriter writer = new BufferedWriter(new FileWriter(targetPath))) {
            char[] buffer = new char[DEFAULT_BUFFER_SIZE];
            int bytesRead;

            while ((bytesRead = reader.read(buffer)) != -1) {
                writer.write(buffer, 0, bytesRead);
            }
        }
    }

    public static void copy(String sourcePath, String targetPath, int bufferSize) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(sourcePath));
             BufferedWriter writer = new BufferedWriter(new FileWriter(targetPath))) {
            char[] buffer = new char[bufferSize];
            int bytesRead;

            while ((bytesRead = reader.read(buffer)) != -1) {
                writer.write(buffer, 0, bytesRead);
            }
        }
    }
}

/**
 * [Исходный файл] → FileReader → BufferedReader → [Буфер] → BufferedWriter → FileWriter → [Целевой файл]
 *                      ↑                             ↓
 *                   Физическое                  Физическая
 *                   чтение с диска              запись на диск
 */