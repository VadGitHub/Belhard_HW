/*
Task 7.
Создайте массив из N случайных целых чисел из отрезка [A;B],
числа N, A и B вводятся с клавиатуры. Отсортировать массив любым алгоритмом.
Вывести массив на экран, после чего ввести с клавиатуры число k,
найти индекс этого числа в массиве сперва линейным поиском,
потом двоичным и вывести на экран этот индекс, если число есть в массиве,
и количество «шагов», которое каждый алгоритм потратил на выполнение задачи.
 */

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Random rnd = new Random();
        int N, A, B, k;
        int counter = 0;
        int foundIndex = -1;
        int bufValue;
        int maxIndex;
        int startIndex, endIndex, mediumIndex;
        int[] array;

        do {
            System.out.print("Введите размер массива: ");
            N = scan.nextInt();
        } while (N <= 0);

        do {
            System.out.print("Введите нижний диапазон: ");
            A = scan.nextInt();
        } while (A < 0);

        do {
            System.out.print("Введите верхний диапазон: ");
            B = scan.nextInt();
        } while (A > B);

        array = new int[N];

        System.out.println("Массив (исходный):");

        //array = new int[]{1, 2, 2, 3, 5, 6, 7, 8, 8}; // тест
        //Генерация массива
        for (int i = 0; i < array.length; i++) {
            array[i] = rnd.nextInt(B + 1 - A) + A;
            System.out.print(array[i] + " ");
        }

        //Сортировка массива (пузырьком)
//        for (int i = 0; i < array.length; i++){
//            for (int j = 0; j < array.length - i - 1; j++){
//                if (array[j] > array[j+1]){
//                    bufValue = array[j+1];
//                    array[j+1] = array[j];
//                    array[j] = bufValue;
//                }
//            }
//        }

        //Сортировка массива (выбором)
        for (int i = array.length - 1; i >= 0; i--){
            maxIndex = i;

            for (int j = i; j >= 0; j--){
                if (array[j] > array[maxIndex]){
                    maxIndex = j;
                }
            }

            bufValue = array[i];
            array[i] = array[maxIndex];
            array[maxIndex] = bufValue;

        }

        //Вывод отсортированного массива
        System.out.println();
        System.out.println("Массив отсортированный:");
        for (int i : array) {
            System.out.print(i + " ");
        }

        System.out.println();
        System.out.println("Введите искомое значение: ");
        k = scan.nextInt();

        //Линейный поиск
        for (int i = 0; i < array.length; i++){
            counter++; // если учитываются все попытки
            if (array[i] == k){
                foundIndex = i;
                break;
            }

        }

        if (foundIndex != -1){
            System.out.print("Индекс элемента: " + foundIndex);
            System.out.println();
            System.out.print("Линейный поиск: " + counter + " шаг(-а)(-ов)");

        //Бинарный поиск
            counter = 0;
            startIndex = 0;
            endIndex = array.length - 1;
            while (startIndex <= endIndex){
                counter++; // если учитываются все попытки
                mediumIndex = ( startIndex + endIndex ) / 2;
                if (array[mediumIndex] == k){
                    //здесь можно проверить совпадает ли индекс с линейным поиском
                    break;
                } else if (array[mediumIndex] > k) {
                    endIndex = mediumIndex - 1;
                } else if (array[mediumIndex] < k) {
                    startIndex = mediumIndex + 1;
                }
                //counter++; // Если не учитывать попытку находки
            }

            System.out.println();
            System.out.print("Двоичный поиск: " + counter + " шаг(-а)(-ов)");

        } else {
            System.out.println("Искомое значение " + k  + " не найдено в массиве!");
        }

    }
}