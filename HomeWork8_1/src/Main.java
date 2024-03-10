/*
Exercise 8. Task 1 (Библиотека 2.0)
Переписать проект Библиотеки (Library) заменив массивы коллекциями.
Вместо массива читателей и массивов книг использовать список читателей
и списки книг (ArrayList или LinkedList).
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int choice;
        int readerIndex;
        List<Reader> readers = new ArrayList<>();
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
                    if (Reader.isExistLibNum()){//Если есть доступные читательские билеты
                        Reader reader = new Reader();
                        readers.add(reader);
                        System.out.print("Читатель добавлен успешно. ");
                        System.out.println("Выдан читательский билет №" + reader.getNumLibCard());

                        reader = null; //создали читателя, добавили в список и удалили ссылку
                    } else {
                        System.out.println("Читательские билеты закончились!");
                    }

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
                    if (readers.size() == 0){
                        System.out.println("Нет читателей");
                    } else {
                        for (int i = 0; i < readers.size(); i++) {
                            if (readers.get(i) != null){
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
            if (readers.get(i).getNumLibCard() == numLibCard){
                foundIndex = i;//чит.билет найден
                break;
            }
        }
        return foundIndex;
    }
}