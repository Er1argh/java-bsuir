public class Plum extends Fruit {
    private static final double PRICE_PER_KG = 5.0;

    private Plum() {
        super();
    }

    public Plum(double weight) {
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
