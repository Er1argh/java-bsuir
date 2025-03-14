public class Apple extends Fruit {
    private static final double PRICE_PER_KG = 3.0;

    public Apple() {
        super();
    }

    public Apple(double weight) {
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
