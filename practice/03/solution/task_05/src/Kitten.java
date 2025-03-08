public class Kitten extends Cat {
    private String feedingTime;

    public Kitten(double weight, int age, String name, int miceCaught, String feedingTime) {
        super(weight, age, name, miceCaught);
        this.feedingTime = feedingTime;
    }

    public Kitten() {
        this.feedingTime = "Неизвестно";
    }

    public void setFeedingTime(String feedingTime) {
        this.feedingTime = feedingTime;
    }

    public String getFeedingTime() {
        return feedingTime;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Время кормления: " + feedingTime);
    }
}
