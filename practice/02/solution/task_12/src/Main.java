public class Main {
    public static void main(String[] args) {
        Animal animal1 = new Animal("Барсик", 6, 3.5, 25.0);
        Animal animal2 = new Animal("Мурка", 4, 1.8, 18.0);
        Animal animal3 = new Animal("Барсик", 7, 4.2, 30.0);

        animal1.printInfo();
        animal2.printInfo();
        animal3.printInfo();

        System.out.println("Одинаковые ли имена у animal1 и animal2? " + animal1.hasSameName(animal2));
        System.out.println("Одинаковые ли имена у animal1 и animal3? " + animal1.hasSameName(animal3));

        animal1.compareWithThresholds();
        animal2.compareWithThresholds();
        animal3.compareWithThresholds();
    }
}
