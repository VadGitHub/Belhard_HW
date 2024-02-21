
/*
Task 2.
Попросить пользователя ввести с клавиатуры сперва размер массива,
потом нижний диапазон значений и верхний. После чего создать массив размером,
который ввел пользователь и заполнить его случайными числами из диапазона, введенного пользователем.
Если пользователь ввел неверные значения (отрицательный размер массива, нижняя граница
диапазона больше верхнего и т.д.) попросить его ввести значение ещё раз и перезаписать
старое значение новым. Вывести массив на экран (Для этого удобнее пользоваться не println, а print)
 */

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rnd = new Random();

        int[] array;
        int arraySize;
        int minRng = 1, maxRng = 1;

        do {
            System.out.print("Введите размер массива: ");
            arraySize = scan.nextInt();
            if (arraySize < 1) {
                System.out.println("Размер массива указан неверно!");
            }
        } while (arraySize < 1);

        do {
            System.out.print("Укажите НИЖНЮЮ границу диапазона для генерации значений массива: ");
            minRng = scan.nextInt();
            if (minRng > 0) {
                System.out.print("Укажите ВЕРХНЮЮ границу диапазона для генерации значений массива: ");
                maxRng = scan.nextInt();
            } else {
                System.out.println("НИЖНЯЯ граница указана неверно!");
            }

            if (maxRng < minRng) {
                System.out.println("ВЕРХНЯЯ граница указана неверно!");
            }

        } while (maxRng < minRng || maxRng <= 0 || minRng <= 0);

        array = new int[arraySize];

        for (int i = 0; i < array.length; i++) {
            array[i] = rnd.nextInt(maxRng + 1 - minRng) + minRng;
        }

        System.out.println("Полученный массив:");
        for (int i : array) {
            System.out.print(i + " ");
        }


    }
}