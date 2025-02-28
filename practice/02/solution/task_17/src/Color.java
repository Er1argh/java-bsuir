public enum Color {
    RED(0, "Красный"),
    ORANGE(1, "Оранжевый"),
    YELLOW(2, "Желтый"),
    GREEN(3, "Зеленый"),
    BLUE(4, "Голубой"),
    DARK_BLUE(5, "Синий"),
    PURPLE(6, "Фиолетовый");

    private final int NUMBER;
    private final String NAME;

    Color(int number, String name) {
        this.NUMBER = number;
        this.NAME = name;
    }

    public int getNumber() {
        return NUMBER;
    }

    public String getName() {
        return NAME;
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
