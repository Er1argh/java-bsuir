public class Guitar implements Instrument {
    private int numberOfStrings;

    public Guitar() {
        numberOfStrings = 0;
    }

    public Guitar(int numberOfStrings) {
        this.numberOfStrings = numberOfStrings;
    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }

    public void setNumberOfStrings(int numberOfStrings) {
        this.numberOfStrings = numberOfStrings;
    }

    @Override
    public void play() {
        System.out.println("Играет гитара с " + numberOfStrings + " струнами в тональности " + KEY);
    }
}
