public class Animal {
    public double weight;
    public int age;
    public String name;

    public Animal(double weight, int age, String name) {
        this.weight = weight;
        this.age = age;
        this.name = name;
    }

    public Animal() {
        weight = 0.0;
        age = 0;
        name = "Неизвестно";
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void displayInfo() {
        System.out.println("Имя: " + name + ", возраст: " + age + ", вес: " + weight);
    }
}
