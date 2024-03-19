
/*
Task 1.
Создайте массив из 4 случайных целых чисел из отрезка [10;99],
выведите его на экран в строку. Определить и вывести на экран сообщение о том,
является ли массив строго возрастающей последовательностью
 */

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[4];
        int minRng = 10;
        int maxRng = 99;
        int preValue = 0;
        boolean isIncrease = true;
        Random rnd = new Random();

        // генерация и вывод массива
        System.out.println("Полученный массив: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = rnd.nextInt(maxRng + 1 - minRng) + minRng;
            System.out.print(array[i] + " ");
        }

        //определение последовательности (возрастающая?)
        for (int i : array) {
            if (isIncrease && i < preValue) {
                isIncrease = false;
            }
            preValue = i;
        }

        if (isIncrease) {
            System.out.println("\nМассив имеет строго возрастающую последовательность");
        } else {
            System.out.println("\n" +
                    "Массив НЕ имеет возрастающую последовательность");
        }

    }
}