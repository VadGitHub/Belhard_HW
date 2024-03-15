
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Reader implements Serializable {
    private String fName, sName, mName;
    private final int maxListBook = 10;
    private int numLibCard;
    private List<Book> listBooks;

    public Reader() {
        this(1);
    }

    public Reader(int numLibCard) {
        Scanner scan = new Scanner(System.in);
        do {
            System.out.print("Введите фамилию: ");
            fName = scan.nextLine();
        } while (fName.isEmpty());

        do {
            System.out.print("Введите имя: ");
            sName = scan.nextLine();
        } while (sName.isEmpty());

        do {
            System.out.print("Введите отчество: ");
            mName = scan.nextLine();
        } while (mName.isEmpty());

        //Выдача читательского билета
        this.numLibCard = numLibCard;

        //создаем пул списка книг для Читателя
        listBooks = new ArrayList<>();

    }

    public void takeBook() {
        //добавить в массив listBooks
        //вывести «Петров В.В. взял книгу Игра Эндера»
        if (isListBookFull()) {
            System.out.println(getFullName() + " уже не может взять. Необходимо что-то сдать");
        } else {
            Book book = new Book();
            listBooks.add(book);
            System.out.println(getFullName() + " взял книгу " + book.getName());
            book = null;
        }

    }

    public void returnBook(String nameBook) {
        //убрать книгу из массива
        //вывести «Петров В.В. вернул книгу Игра Эндера»
        //или
        //вывести «Петров В.В. не хранит книгу Игра Эндера»
        boolean isFound = false;
        for (int i = 0; i < listBooks.size(); i++) {
            if (listBooks.get(i).getName().equals(nameBook)) {
                listBooks.remove(i);
                isFound = true;
                System.out.println(getFullName() + " вернул книгу " + nameBook);
                break;
            }
        }
        if (!isFound) {
            System.out.println(getFullName() + " не хранит книгу " + nameBook);
        }
    }

    public void printStatus() {
        //вывести статус
        //«Петров В. В. взял 3 книги: Мастер и Маргарита, Война и Мир, Люпен»
        String lineBooks = "";
        String lineBookAndAuthor = "";
        for (int i = 0; i < listBooks.size(); i++) {
            if (listBooks.get(i).getName() != null) {
                lineBookAndAuthor = listBooks.get(i).getName()
                        + " (автор: " + listBooks.get(i).getAuthorName() + ")";
                if (lineBooks.isEmpty()) {
                    lineBooks = lineBookAndAuthor;
                } else {
                    lineBooks += "; " + lineBookAndAuthor;
                }
            }
        }

        if (!lineBooks.isEmpty()) {
            System.out.println(getFullName()
                    + " (№" + getNumLibCard()
                    + ") " + " взял " + listBooks.size() + " книгу(и): "
                    + lineBooks);
        } else {
            System.out.println(getFullName() + " (№" + getNumLibCard() + ") " + " не имеет книг");
        }

    }

    public String getFullName() {
        return fName + " " + sName + " " + mName;
    }

    public int getNumLibCard() {
        return numLibCard;
    }

    private boolean isListBookFull() {
        if (listBooks.size() >= maxListBook) {
            return true;
        }
        return false;
    }


}