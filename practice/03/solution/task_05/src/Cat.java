public class Cat extends Animal {
    private int miceCaught;

    public Cat(double weight, int age, String name, int miceCaught) {
        super(weight, age, name);
        this.miceCaught = miceCaught;
    }

    public Cat() {
        miceCaught = 0;
    }

    public void setMiceCaught(int miceCaught) {
        this.miceCaught = miceCaught;
    }

    public int getMiceCaught() {
        return miceCaught;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Количество пойманных мышей: " + miceCaught);
    }
}
