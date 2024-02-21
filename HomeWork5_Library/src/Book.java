import java.util.Scanner;

public class Book {
    private String name;
    private String authorName;
    private String text;

    public Book() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите название книги: ");
        this.name = scan.nextLine();
        System.out.print("Введите автора: ");
        this.authorName = scan.nextLine();
    }

    public String getName() {
        return name;
    }
}
