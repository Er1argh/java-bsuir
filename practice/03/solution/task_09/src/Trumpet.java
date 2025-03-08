public class Trumpet implements Instrument {
    public double diameter;

    public Trumpet() {
        diameter = 0.0;
    }

    public Trumpet(double diameter) {
        this.diameter = diameter;
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    @Override
    public void play() {
        System.out.println("Играет труба с диаметром " + diameter + " см в тональности " + KEY);
    }
}
