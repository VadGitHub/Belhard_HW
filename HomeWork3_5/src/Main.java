/*
Task 5.
Создать и проинициализировать массив из 20 элементов.
Ввести с клавиатуры число n и найти, есть ли оно в массиве, и, если есть,
вывести его индекс на экран. Использовать линейный поиск
 */

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Random rnd = new Random();

        int[] array = new int[20];
        int searchValue;
        int foundIndex = -1;

        for (int i = 0; i < array.length; i++){
            array[i] = rnd.nextInt(101);
        }

        System.out.println("Сгенерирован массив из 20 элементов со значениями от 0 до 100");
        System.out.print("Попробуйте угадать один элемент! Введите число: ");
        searchValue = scan.nextInt();

        System.out.println("Сгенерированый Массив:");
        //Вывод массива
        for (int i : array){
            System.out.print(i + " ");
        }

        //Поиск элемента в массиве
        for (int i = 0; i < array.length; i++){
            if (array[i] == searchValue) {
                foundIndex = i;
                break;
            }
        }

        System.out.println();
        if (foundIndex != -1){
            System.out.println("Угадали! Ваше число под индексом: " + foundIndex);
        } else {System.out.println("К сожалению, не угадали");}

    }
}