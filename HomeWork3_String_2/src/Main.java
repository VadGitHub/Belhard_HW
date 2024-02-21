/*
String Task 2.
	С клавиатуры вводится любая строка. Если она пустая,
	выводится сообщение с просьбой повторить ввод.
	Далее с клавиатуры вводятся два символа (a и b),
	после чего нужно вывести строку, в которой все символы a нужно
	заменить на символы b.
	Пример: срока – «Java 11», символы «1» и «H», результат «Java HH»
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String text;
        String symbolA, symbolB;
        boolean isReplace = false;
        char[] arrayText;
        char[] arraySymbolA, arraySymbolB;
        char charSymbolA, charSymbolB;

        do {
            System.out.print("Введите строку: ");
            text = scan.nextLine();
            if (text.isEmpty()){
                System.out.print("Строка пустая! Повторите ввод!");
            }

        } while (text.isEmpty());

        do {
            System.out.print("Введите символ, который необходимо заменить: ");
            symbolA = scan.nextLine();
        } while (symbolA.length() > 1);

        do {
            System.out.print("Введите символ, на который будет произведена замена: ");
            symbolB = scan.nextLine();
        } while (symbolB.length() > 1);

        arrayText = text.toCharArray();
        arraySymbolA = symbolA.toCharArray();
        arraySymbolB = symbolB.toCharArray();

        for (int i = 0; i < arrayText.length; i++){
            if (arrayText[i] == arraySymbolA[0]){
                arrayText[i] = arraySymbolB[0];
                isReplace = true;
            }
        }

        if (isReplace){
            text = new String(arrayText);
            System.out.println("Результ изменений: " + text);
        } else {System.out.println("Изменений не произведено. Символ '" + symbolA + "' не найден в строке");}

    }
}