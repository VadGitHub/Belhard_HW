
import java.util.Random;
import java.util.Scanner;

public class Reader {
    private String fName, sName, mName;
    private final int startRngLibCard = 100000;
    private final int endRngLibCard = 999999;
    private int numLibCard;
    private String faculity;
    private String dateBirth;
    private String phone;
    private String[] listBooks; //в след.версии исправлено на массив книг
    Scanner scan;
    Random rnd;

    public Reader() {
        scan = new Scanner(System.in);
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
        rnd = new Random();
        numLibCard = rnd.nextInt(endRngLibCard + 1 - startRngLibCard) + startRngLibCard;

        //создаем пул списка книг для Читателя
        listBooks = new String[10];//в след.версии исправлено на массив книг

    }

    public void takeBook(Book book) {
        //добавить в массив listBooks
        //вывести «Петров В.В. взял книгу Игра Эндера»
        int i = getListBookFreeIndex();

        if (i != -1) {
            listBooks[i] = book.getName();
            System.out.println(getFullName() + " взял книгу " + listBooks[i]);
        } else {
            System.out.println(getFullName() + " уже не может взять. Необходимо что-то сдать");
        }
    }

    public void returnBook(String nameBook) {
        //убрать книгу из массива
        //вывести «Петров В.В. вернул книгу Игра Эндера»
        //или
        //вывести «Петров В.В. не хранит книгу Игра Эндера»
        boolean isFound = false;
        for (int i = 0; i < listBooks.length; i++) {
            if (listBooks[i] != null && listBooks[i].equals(nameBook)) {
                listBooks[i] = null;
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
        for (int i = 0; i < listBooks.length; i++) {
            if (listBooks[i] != null) {
                if (lineBooks.isEmpty()) {
                    lineBooks = listBooks[i];
                } else {
                    lineBooks += ", " + listBooks[i];
                }
            }
        }
        if (!lineBooks.isEmpty()) {
            System.out.println(getFullName() + " (№" + getNumLibCard() + ") " + " взял: " + lineBooks);
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

    public int getListBookFreeIndex() {
        for (int i = 0; i < listBooks.length; i++) {
            if (listBooks[i] == null) {
                return i;
            }
        }
        return -1;//нет свободного места для книг
    }

}
