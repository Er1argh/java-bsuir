public class Animal {
    private String name;
    private int age;
    private double weight;
    private double height;

    private static final int AGE_THRESHOLD = 5;
    private static final double WEIGHT_THRESHOLD = 2.0;
    private static final double HEIGHT_THRESHOLD = 20.0;

    public Animal() {
        this.name = "Неизвестно";
        this.age = 0;
        this.weight = 0.0;
        this.height = 0.0;
    }

    public Animal(String name, int age, double weight, double height) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    public void printInfo() {
        System.out.println("Имя: " + name);
        System.out.println("Возраст: " + age + " лет");
        System.out.println("Вес: " + weight + " кг");
        System.out.println("Рост: " + height + " см");
    }

    public boolean hasSameName(Animal other) {
        return this.name.equals(other.name);
    }

    public void compareWithThresholds() {
        System.out.print(name + " - ");
        System.out.print(age > AGE_THRESHOLD ? "старше " + AGE_THRESHOLD + " лет; " : "младше или равно " + AGE_THRESHOLD + " лет; ");
        System.out.print(weight < WEIGHT_THRESHOLD ? "легче " + WEIGHT_THRESHOLD + " кг; " : "тяжелее или равно " + WEIGHT_THRESHOLD + " кг; ");
        System.out.println(height > HEIGHT_THRESHOLD ? "выше " + HEIGHT_THRESHOLD + " см." : "ниже или равно " + HEIGHT_THRESHOLD + " см.");
    }
}
