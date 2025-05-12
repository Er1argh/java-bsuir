package tasks.task_04.test;

import tasks.task_04.model.Horse;
import tasks.task_04.service.HorseSerializer;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        Horse horse = new Horse("Thunder", 72.5);

        try {
            HorseSerializer.serializeHorseToFile(horse, "tasks/task_04/test/horse_data.ser");
            System.out.println("Horse serialized successfully");
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            Horse restoredHorse = HorseSerializer.deserializeHorseFromFile("tasks/task_04/test/horse_data.ser");
            System.out.println("Deserialized Horse: " +
                    "\nName: " + restoredHorse.getName() +
                    "\nSpeed: " + restoredHorse.getSpeed());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
