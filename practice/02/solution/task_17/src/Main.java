import java.util.Scanner;

enum Color {
    RED(0, "Красный"),
    ORANGE(1, "Оранжевый"),
    YELLOW(2, "Желтый"),
    GREEN(3, "Зеленый"),
    BLUE(4, "Голубой"),
    DARK_BLUE(5, "Синий"),
    PURPLE(6, "Фиолетовый");

    private final int number;
    private final String name;

    Color(int number, String name) {
        this.number = number;
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public static Color getByNumber(int number) {
        for (Color color : values()) {
            if (color.getNumber() == number) {
                return color;
            }
        }
        return null;
    }

}

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
