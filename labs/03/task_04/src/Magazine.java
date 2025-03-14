public class Magazine implements Printable {
    private String name;

    public Magazine() {
        name = "null";
    }

    public Magazine(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void print() {
        System.out.println("Журнал: " + name);
    }

    public static void printMagazines(Printable[] printables) {
        for (Printable printable : printables) {
            if (printable instanceof Magazine) {
                Magazine magazine = (Magazine) printable;
                System.out.println(magazine.getName());
            }
        }
    }
}
