/*
Exercise 7. Task 1
1.	Составляем строку с помощью класса StringBuilder
Дано два числа, например 3 и 56, необходимо составить следующие строки:
3 + 56 = 59
3 – 56 = -53
3 * 56 = 168.
Используем метод StringBuilder.append().
Замените символ “=” на слово “равно”. Используйте метод StringBuilder.replace()

 */


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a, b, result = 0;
        int counter = 0;
        String line = "";

        StringBuilder strResult = new StringBuilder(line);

        System.out.print("Введите первое число: ");
        a = scan.nextInt();
        System.out.print("Введите второе число: ");
        b = scan.nextInt();

        do {
            String sign = "";
            counter++;
            switch (counter){
                case 1:
                    sign = " + ";
                    result = a + b;
                    break;
                case 2:
                    sign = " - ";
                    result = a - b;
                    break;
                case 3:
                    sign = " * ";
                    result = a * b;
                    break;
            }

            System.out.println(strResult.append(a).append(sign).append(b).append(" = ").append(result));
            int indexOfEqual = strResult.indexOf("=");
            strResult.replace(indexOfEqual, indexOfEqual+1 ,"равно");
            System.out.println(strResult);
            strResult.delete(0, strResult.length());
        }while (counter < 3);

    }
}