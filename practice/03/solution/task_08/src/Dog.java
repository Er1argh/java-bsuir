public class Dog extends Animal {
    private String breed;

    public Dog(double weight, int age, String name, String breed) {
        super(weight, age, name);
        this.breed = breed;
    }

    public Dog(Dog other) {
        super(other);
        this.breed = other.breed;
    }

    public Dog() {
        super();
        breed = "null";
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Порода: " + breed);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " лает: Гав-гав");
    }
}
