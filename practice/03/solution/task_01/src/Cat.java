public class Cat extends Animal {
    public int miceCaught;

    public Cat() {
        super();
        miceCaught = 0;
    }

    public Cat(double weight, int age, String name, int miceCaught) {
        super(weight, age, name);
        this.miceCaught = miceCaught;
    }

    public void setMiceCaught(int miceCaught) {
        this.miceCaught = miceCaught;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Количество пойманных мышей: " + miceCaught);
    }
}
