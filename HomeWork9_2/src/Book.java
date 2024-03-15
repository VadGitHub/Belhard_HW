import java.io.Serializable;
import java.util.Scanner;

public class Book implements Serializable {
    private String name;
    private String authorName;
    private String text;

    public Book() {
        Scanner scan = new Scanner(System.in);
        do {
            System.out.print("Введите название книги: ");
            name = scan.nextLine();
        } while (name.isEmpty());

        do {
            System.out.print("Введите автора: ");
            authorName = scan.nextLine();
        } while (authorName.isEmpty());

    }

    public String getName() {
        return name;
    }

    public String getAuthorName() {
        return authorName;
    }
}