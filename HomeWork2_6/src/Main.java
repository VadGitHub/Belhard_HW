/*
Task 6.
Дано целое число, лежащее в диапазоне 0–999.
Вывести строку-описание этого числа. Строку-описание вида «четное двузначное число»,
«нечетное трехзначное число» и т. д.
 */

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random rnd = new Random();
        int number;
        int numSign = 0;
        String strDesc;

        number = rnd.nextInt(1000);
        System.out.println("Случайное число в диапазоне [0-999]: " + number);

        if ((number % 2) == 0){
            strDesc = "четное";
        } else { strDesc = "нечетное"; }

        while (number >= 1){
                number /= 10;
                numSign++; // кол-во знаков
            }

        switch (numSign){
            case 0:
            case 1:
                strDesc += " однозначное";
                break;
            case 2:
                strDesc += " двузначное";
                break;
            case 3:
                strDesc += " трехзначное";
                break;
        }

        System.out.print(strDesc);

    }
}