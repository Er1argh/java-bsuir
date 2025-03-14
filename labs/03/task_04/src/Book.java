public class Book implements Printable {
    private String name;

    public Book() {
        name = "null";
    }

    public Book(String name) {
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
        System.out.println("Книга: " + name);
    }

    public static void printBooks(Printable[] printables) {
        for (Printable printable : printables) {
            if (printable instanceof Book) {
                Book book = (Book) printable;
                System.out.println(book.getName());
            }
        }
    }
}
