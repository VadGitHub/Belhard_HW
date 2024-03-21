import java.util.Scanner;

public class Book {
    private String name;
    private String authorName;
    private String text;

    public Book() {
//        Scanner scan = new Scanner(System.in);
//        System.out.print("Введите название книги: ");
//        this.name = scan.nextLine();
//        System.out.print("Введите автора: ");
//        this.authorName = scan.nextLine();
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getName() {
        return name;
    }
}
