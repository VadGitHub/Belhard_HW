/*
String Task 1.
	Написать программу, в которой вводятся с клавиатуры сперва строка,
	а потом символ. После чего в консоль выводится количество вхождений
	символа в строку.
	Например, строка «Java 11», символ «a», результат: 2
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String text;
        String symbol;
        char[] arrayText;
        char[] arraySymbol;
        int counter = 0;

        do {
            System.out.print("Введите строку: ");
            text = scan.nextLine();

        } while (text.isEmpty());

        do {
            System.out.print("Введите символ: ");
            symbol = scan.nextLine();
        } while (symbol.length() > 1);

        arrayText = text.toCharArray();
        arraySymbol = symbol.toCharArray();

        for (int i = 0; i < arrayText.length; i++){
            if (arrayText[i] == arraySymbol[0]){
                counter++;
            }
        }

        if (counter > 0){
            System.out.println("Символ '" + symbol + "' встречается в строке " + counter + " раз(а)");
        } else {System.out.println("Символа '" + symbol + "' в строке нет");}

    }
}