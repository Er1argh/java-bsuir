import java.util.Scanner;

public class Book {
    private String author;
    private String title;
    private int year;
    private int pages;

    public Book() {
        this.author = "Неизвестный автор";
        this.title = "Неизвестное название";
        this.year = 0;
        this.pages = 0;
    }

    public Book(String author, String title, int year, int pages) {
        this.author = author;
        this.title = title;
        this.year = year;
        this.pages = pages;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setAuthor(Scanner scanner) {
        System.out.print("Введите автора: ");

        while (true) {
            if (scanner.hasNext()) {
                this.author = scanner.nextLine();

                break;
            } else {
                System.out.println("Ошибка! Введите имя автора");
                scanner.next();
            }
        }

    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setTitle(Scanner scanner) {
        System.out.print("Введите название: ");

        while (true) {
            if (scanner.hasNext()) {
                this.title = scanner.nextLine();

                break;
            } else {
                System.out.println("Ошибка! Введите название");
                scanner.next();
            }
        }
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setYear(Scanner scanner) {
        System.out.print("Введите год: ");

        while (true) {
            if (scanner.hasNextInt()) {
                this.year = scanner.nextInt();

                if (year > 0) {
                    break;
                } else {
                    System.out.println("Ошибка! Введите год (положительное число)");
                }
            } else {
                System.out.println("Ошибка! Введите год (целое число)");
                scanner.next();
            }
        }
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public void setPages(Scanner scanner) {
        System.out.print("Введите количество страниц: ");

        while (true) {
            if (scanner.hasNextInt()) {
                this.pages = scanner.nextInt();

                if (pages > 0) {
                    break;
                } else {
                    System.out.println("Ошибка! Введите количество страниц  (положительное число)");
                }
            } else {
                System.out.println("Ошибка! Введите количество страниц (целое число)");
                scanner.next();
            }
        }
    }


    public void printBookInfo(String searchTitle) {
        if (this.title.equalsIgnoreCase(searchTitle)) {
            System.out.println("Автор: " + author);
            System.out.println("Название: " + title);
            System.out.println("Год выпуска: " + year);
            System.out.println("Количество страниц: " + pages);
        } else {
            System.out.println("Книга с таким названием не найдена");
        }
    }
}
