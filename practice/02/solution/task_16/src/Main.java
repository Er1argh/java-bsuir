public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Alex; 45; 90; 185");
        person1.printInfo();

        System.out.println("Сравнение с другой строкой: " + person1.compare("Serg; 25; 80; 180"));

        person1.setName("John");
        person1.setAge(50);
        person1.setWeight(85);
        person1.setHeight(180);

        System.out.println("После изменений:");
        person1.printInfo();
    }
}
