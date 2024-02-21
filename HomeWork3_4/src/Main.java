/*
Task 4.
Создайте массив из N случайных целых чисел из отрезка [A;B],
числа N, A и B вводятся с клавиатуры. Выведите массив на экран,
после чего отсортируйте его с помощью сортировки «пузырьком» и
выведите уже отсортированный массив
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

        //Сортировка массива
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array.length - i - 1; j++){
                if (array[j] > array[j+1]){
                    bufValue = array[j+1];
                    array[j+1] = array[j];
                    array[j] = bufValue;
                }
            }
        }

        //Вывод отсортированного массива
        System.out.println();
        System.out.println("Массив отсортированный:");
        for (int i : array) {
            System.out.print(i + " ");
        }




    }
}