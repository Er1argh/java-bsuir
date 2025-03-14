public class Pear extends Fruit {
    private static final double PRICE_PER_KG = 4.0;

    public Pear() {
        super();
    }

    public Pear(double weight) {
        super(weight);
    }

    public static double getPricePerKg() {
        return PRICE_PER_KG;
    }

    @Override
    public double getPrice() {
        return weight * PRICE_PER_KG;
    }
}
