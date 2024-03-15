/*
Exercise 9. Task 2 (Библиотека 3.0)
Добавить в проект Library отдельный класс FileUtil, у которого определите два
статических метода:
•	boolean saveReadersList(List<Reader> readers)
•	List<Reader> restoreReadersList()
Первый метод принимает в себя список читателей и сохраняет их всех в один файл
и вызывается в конце программы (подсказка, сохранять в файл нужно не каждого
читателя по очереди, а сразу весь список). В случае, если записать не получилось,
выводит об этом сообщение в консоли.
Второй пытается считать из этого же файла список читателей и возвращает его,
вызывается в начале программы. В случае, если считать не получилось, выводит
об этом сообщение в консоль.
Таким образом у вас должна получиться программа, которая не теряет данные
после её выключения/включения.
 */

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int choice;
        int readerIndex;
        int NumLibCard = 0;

        System.out.println("Запуск программы...");
        List<Reader> readers = FileUtil.restoreReadersList();

        System.out.println();
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
                    NumLibCard = getFreeNumLibCard(readers);
                    Reader reader = new Reader(NumLibCard);
                    readers.add(reader);
                    System.out.print("Читатель добавлен успешно. ");
                    System.out.println("Выдан читательский билет №" + NumLibCard);

                    reader = null; //создали читателя, добавили в список и удалили ссылку

                    break;
                case 2://выдать книгу
                    readerIndex = findReaderByNumCard(readers);
                    if (readerIndex >= 0) { //если читатель найден
                        //попытка выдачи книги
                        readers.get(readerIndex).takeBook();
                    } else {
                        System.out.println("Читательский билет не найден!");
                    }
                    break;
                case 3://сдать книгу
                    readerIndex = findReaderByNumCard(readers);
                    if (readerIndex >= 0) {
                        System.out.print("Сообщите наименование книги для возврата: ");
                        String nameBook = scan.nextLine();
                        readers.get(readerIndex).returnBook(nameBook);
                    } else {
                        System.out.println("Читательский билет не найден!");
                    }
                    break;
                case 4://статус читателя
                    readerIndex = findReaderByNumCard(readers);
                    if (readerIndex >= 0) {
                        readers.get(readerIndex).printStatus();
                    } else {
                        System.out.println("Читательский билет не найден!");
                    }
                    break;
                case 5://статус всех читателей
                    if (readers.size() == 0) {
                        System.out.println("Нет читателей");
                    } else {
                        for (int i = 0; i < readers.size(); i++) {
                            if (readers.get(i) != null) {
                                readers.get(i).printStatus();
                            }
                        }
                    }
                    break;
                case 6://удалить читателя
                    readerIndex = findReaderByNumCard(readers);
                    if (readerIndex >= 0) {
                        System.out.println("Читатель " + readers.get(readerIndex).getFullName() + " удален");
                        readers.remove(readerIndex);
                    } else {
                        System.out.println("Читательский билет не найден!");
                    }
                    break;
                case 7://выход

                    System.out.println("Выход...");
                    System.out.println("Сохранение данных...");
                    if (FileUtil.saveReadersList(readers)) {

                        System.out.println("Сохранено успешно");
                    }
                    break;
                default:
                    System.out.println("Некорректное значение!");
            }

        } while (choice != 7);

    }

    public static int findReaderByNumCard(List<Reader> readers) {
        //Поиск читателя по номеру чит.билета
        Scanner scan = new Scanner(System.in);
        System.out.print("Укажите номер читательского билета: ");
        int numLibCard = scan.nextInt();
        int foundIndex = -1;
        for (int i = 0; i < readers.size(); i++) {
            if (readers.get(i).getNumLibCard() == numLibCard) {
                foundIndex = i;//чит.билет найден
                break;
            }
        }
        return foundIndex;
    }

    public static int getFreeNumLibCard(List<Reader> readers) {
        int maxNumLibCard = 0;

        int sizeOfList = readers.size();

        if (sizeOfList > 0) {
            for (int i = 0; i < sizeOfList; i++) {
                if (readers.get(i).getNumLibCard() > maxNumLibCard) {
                    maxNumLibCard = readers.get(i).getNumLibCard();
                }
            }
        }
        //return maxNumLibCard++; <--- почему-то так не работает???
        return maxNumLibCard + 1;
    }


}