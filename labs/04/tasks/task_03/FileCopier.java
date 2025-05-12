package tasks.task_03;

import java.io.*;

/**
 * Класс для копирования файлов с использованием буферизированных потоков.
 * <p>
 * Реализует два варианта копирования:
 * <ol>
 *   <li>С буфером стандартного размера (16 KB)</li>
 *   <li>С возможностью указания размера буфера</li>
 * </ol>
 *
 * <b>Принцип работы:</b>
 * <pre>
 * [Исходный файл] → FileReader → BufferedReader → [Буфер] → BufferedWriter → FileWriter → [Целевой файл]
 *                      ↑                             ↓
 *                   Физическое                  Физическая
 *                   чтение с диска              запись на диск
 * </pre>
 */
public class FileCopier {
    /**
     * Размер буфера по умолчанию (16 KB)
     */
    private static final int DEFAULT_BUFFER_SIZE = 8192;

    /**
     * Копирует файл с использованием буфера стандартного размера.
     *
     * @param sourcePath Путь к исходному файлу
     * @param targetPath Путь к целевому файлу
     * @throws IOException Если произошла ошибка ввода-вывода
     */
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

    /**
     * Копирует файл с указанием размера буфера.
     *
     * @param sourcePath Путь к исходному файлу
     * @param targetPath Путь к целевому файлу
     * @param bufferSize Размер буфера в символах
     * @throws IOException              Если произошла ошибка ввода-вывода
     * @throws IllegalArgumentException Если bufferSize ≤ 0
     */
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
