import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Доступные цвета:");

        for (Color color : Color.values()) {
            System.out.println(color.getNumber() + ": " + color.getName());
        }

        System.out.print("Введите номер цвета: ");

        int selectedNumber = scanner.nextInt();

        Color selectedColor = Color.getByNumber(selectedNumber);

        if (selectedColor != null) {
            System.out.println("Выбранный цвет: " + selectedColor.getName());
        } else {
            System.out.println("Ошибка: неверный номер цвета.");
        }

        scanner.close();
    }
}
