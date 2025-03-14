public class Magistracy extends Student {
    private String scientificWork;

    public Magistracy() {
        super();
        scientificWork = "null";
    }

    public Magistracy(String firstName, String lastName, String group, double averageMark, String scientificWork) {
        super(firstName, lastName, group, averageMark);
        this.scientificWork = scientificWork;
    }

    public String getScientificWork() {
        return scientificWork;
    }

    public void setScientificWork(String scientificWork) {
        this.scientificWork = scientificWork;
    }

    @Override
    public double getScholarship() {
        return (getAverageMark() >= 8) ? 200 : 180;
    }
}
