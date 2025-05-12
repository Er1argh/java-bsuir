package tasks.task_04.model;

public class Horse extends Animal {
    private double speed;

    public Horse(String name, double speed) {
        super(name);

        this.speed = speed;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }
}
