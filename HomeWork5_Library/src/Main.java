/*
Task
Библиотека + Дополнительное задание
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int choice;
        int readerIndex;
        Reader[] readers = new Reader[10];
        boolean isFull;

        do {
            System.out.println("Выберите действие");
            System.out.println("1 --- Добавить нового читателя");
            System.out.println("2 --- Выдать книгу читателю");
            System.out.println("3 --- Читатель сдает книгу");
            System.out.println("4 --- Вывести статус читателя");
            System.out.println("5 --- Вывести статусы всех читателей");
            System.out.println("6 --- Удалить читателя");
            System.out.println("7 --- выйти из программы");
            choice = scan.nextInt();
            scan.nextLine();

            switch (choice) {
                case 1://новый читатель
                    isFull = true;
                    for (int i = 0; i < readers.length; i++) {
                        if (readers[i] == null) {
                            readers[i] = new Reader();
                            System.out.print("Читатель добавлен успешно. ");
                            System.out.println("Выдан читательский билет №" + readers[i].getNumLibCard());
                            isFull = false;
                            break;
                        }

                    }
                    if (isFull) {
                        System.out.print("Количество читателей уже максимальное");
                        System.out.println(" (" + readers.length + ")");
                    }

                    break;
                case 2://выдать книгу
                    readerIndex = findReaderByNumCard(readers);
                    if (readerIndex >= 0) {
                        if (readers[readerIndex].getListBookFreeIndex() != -1) {
                            Book book = new Book();
                            readers[readerIndex].takeBook(book);
                        }//else {break;}
                    } else {
                        System.out.println("Читательский билет не найден!");
                    }
                    break;
                case 3://сдать книгу
                    readerIndex = findReaderByNumCard(readers);
                    if (readerIndex >= 0) {
                        System.out.print("Сообщите наименование книги для возврата: ");
                        String nameBook = scan.nextLine();
                        readers[readerIndex].returnBook(nameBook);
                    } else {
                        System.out.println("Читательский билет не найден!");
                    }
                    break;
                case 4://статус читателя
                    readerIndex = findReaderByNumCard(readers);
                    if (readerIndex >= 0) {
                        readers[readerIndex].printStatus();
                    } else {
                        System.out.println("Читательский билет не найден!");
                    }
                    break;
                case 5://статус всех читателей
                    int readerCounter = 0;
                    for (int i = 0; i < readers.length; i++) {
                        if (readers[i] != null) {
                            readers[i].printStatus();
                            readerCounter++;
                        }
                    }
                    if (readerCounter == 0){
                        System.out.println("Нет читателей");
                    }
                    break;
                case 6://удалить читателя
                    readerIndex = findReaderByNumCard(readers);
                    if (readerIndex >= 0) {
                        System.out.println("Читатель " + readers[readerIndex].getFullName() + " удален");
                        readers[readerIndex] = null;
                    } else {
                        System.out.println("Читательский билет не найден!");
                    }
                    break;
                case 7://выход
                    System.out.println("Выход...");
                    break;
                default:
                    System.out.println("Некорректное значение!");
            }

        } while (choice != 7);

    }

    public static int findReaderByNumCard(Reader[] readers) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Укажите номер читательского билета: ");
        int numLibCard = scan.nextInt();
        int foundIndex = -1;
        for (int i = 0; i < readers.length; i++) {
            if (readers[i] != null && readers[i].getNumLibCard() == numLibCard) {
                foundIndex = i;//чит.билет найден
                break;
            }
        }
        return foundIndex;
    }
}