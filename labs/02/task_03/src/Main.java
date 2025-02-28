import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Book book1 = new Book();
        Book book2 = new Book();
        Book book3 = new Book("Михаил", "Моя жизнь", 2023, 234);

        book1.setAuthor("Иван");
        book1.setTitle("Мой путь");
        book1.setYear(2021);
        book1.setPages(150);

        book2.setAuthor(scanner);
        book2.setTitle(scanner);
        book2.setYear(scanner);
        book2.setPages(scanner);

        book3.printBookInfo("Моя жизнь");

        scanner.close();
    }
}
