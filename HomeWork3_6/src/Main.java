/*
Task 6.
Создайте массив из N случайных целых чисел из отрезка [A;B],
числа N, A и B вводятся с клавиатуры. Выведите массив на экран,
после чего инвертируйте его и выведите уже инвертрованный массив
 */

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Random rnd = new Random();
        int N, A, B;
        int bufValue;
        int[] array;

        do {
            System.out.print("Введите длину массива: ");
            N = scan.nextInt();
        } while (N <= 0);

        do {
            System.out.print("Задайте нижнюю границу генерации: ");
            A = scan.nextInt();
        } while (A < 0);

        do {
            System.out.print("Задайте верхнюю границу генерации: ");
            B = scan.nextInt();
        } while (A > B);

        array = new int[N];

        System.out.println("Полученный массив (исходный):");

        //Генерация массива
        for (int i = 0; i < array.length; i++) {
            array[i] = rnd.nextInt(B + 1 - A) + A;
            System.out.print(array[i] + " ");
        }

        //Инверсия массива
        for (int i = 0; i < array.length / 2; i++) {
            bufValue = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = bufValue;
        }

        //Вывод инвертированного массива
        System.out.println();
        System.out.println("Массив инвертированный:");

        for (int i : array) {
            System.out.print(i + " ");
        }

    }
}