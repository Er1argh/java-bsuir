abstract public class Fruit {
    protected double weight;

    public Fruit() {
        weight = 0.0;
    }

    public Fruit(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void printManufacturerInfo() {
        System.out.println("Made in RB");
    }

    public abstract double getPrice();
}
