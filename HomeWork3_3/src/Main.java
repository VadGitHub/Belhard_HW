/*
Task 3.
Создайте массив из N случайных целых чисел из отрезка [A;B],
числа N, A и B вводятся с клавиатуры. Определите какой элемент
является в этом массиве максимальным и сообщите его индекс
 */

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Random rnd = new Random();
        int N, A, B;
        int maxIndex = 0;
        int maxValue = 0, curValue;
        int[] array;


        do{ System.out.print("Введите длину массива: ");
            N = scan.nextInt();
        }while (N <= 0);

        do{ System.out.print("Задайте нижнюю границу генерации: ");
            A = scan.nextInt();
        }while (A < 0);

        do{ System.out.print("Задайте верхнюю границу генерации: ");
            B = scan.nextInt();
        }while (A > B);

        array = new int[N];

        System.out.println("Полученный массив:");
        for (int i = 0; i < array.length; i++){
            curValue = rnd.nextInt(B + 1 - A) + A;

            if (i == 0 || curValue >= maxValue){
                maxValue = curValue;
                maxIndex = i;
            }
            System.out.print(curValue + " ");
            //array[i] = curValue;
        }

        System.out.println();
        System.out.println("Максимальное значение элемента массива " + maxValue + " с индексом " + maxIndex);

    }
}