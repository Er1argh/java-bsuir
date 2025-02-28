public class Warehouse {
    private int quantity;
    private double pricePerUnit;

    public Warehouse() {
        this.quantity = 0;
        this.pricePerUnit = 0.0;
    }

    public Warehouse(int quantity, double pricePerUnit) {
        this.quantity = quantity;
        this.pricePerUnit = pricePerUnit;
    }

    public void setQuantity(int newQuantity) {
        this.quantity = newQuantity;
    }

    public void setPricePerUnit(double newPricePerUnit) {
        this.pricePerUnit = newPricePerUnit;
    }

    public double calculateTotalCost() {
        return quantity * pricePerUnit;
    }

    public boolean isMoreExpensiveThan(Warehouse other) {
        return this.calculateTotalCost() > other.calculateTotalCost();
    }

    public static int totalQuantity(Warehouse... warehouses) {
        int total = 0;

        for (Warehouse warehouse : warehouses) {
            total += warehouse.quantity;
        }

        return total;
    }
}
