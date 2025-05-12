package tasks.task_04.service;

import tasks.task_04.model.Horse;

import java.io.*;

public class HorseSerializer {
    public static void serializeHorseToFile(Horse horse, String filePath) throws IOException {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filePath))) {
            oos.writeObject(horse);
        }
    }

    public static Horse deserializeHorseFromFile(String pathFile) throws IOException, ClassNotFoundException {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(pathFile))) {
            return (Horse) ois.readObject();
        }
    }
}
