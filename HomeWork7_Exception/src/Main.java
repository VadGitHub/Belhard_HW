/*
Exercise 7. Task Исключения
Создайте новое исключение и назовите его IncorrectInfoException,
добавьте в него поля для возраста и ФИО. Напишите программу, которая
просит пользователя ввести ФИО через пробел и возраст.
Если Возраст больше 100 или меньше 0, то «бросать» IncorrectInfoException,
записывать в него данные пользователя и сообщение о том, что возраст некорректен.
Если ФИО длиннее 200 символов, или использовались символы пунктуации (.,!?& и тд),
то тоже бросать исключение и записывать в него сообщение о некорректности данных и
сами данные.
В обработке исключения выводить на экран трассированный стек
 */

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String FIO = "";
        int age;

        try {

            System.out.print("Введите ФИО: ");
            FIO = scan.nextLine();
            checkData(FIO);

            System.out.print("Введите возраст: ");
            age = scan.nextInt();
            checkData(age);

        } catch (IncorrectInfoException ex){
            ex.printStackTrace();

        } catch (Exception ex){
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        }


    }
    public static void checkData(String fio) throws IncorrectInfoException{
        String msg = "ФИО введено некорректно: ";
        int maxLen = 200;
        String specSymbols = "[^a-zA-Zа-яА-Я]";
        String badSymbols = "";
        if (fio.length() > maxLen){
            msg += "длина больше " + maxLen;
            throw new IncorrectInfoException(msg, fio);
        }
        Pattern pattern = Pattern.compile(specSymbols);
        Matcher matcher = pattern.matcher(fio);
        while (matcher.find()){
            badSymbols += matcher.group();
        }
        if (!(badSymbols.isEmpty())){
            msg += "содержит недопустимые символы (спецсимволы) " + badSymbols;
            throw new IncorrectInfoException(msg, fio);
        }

    }
    public static void checkData(int age) throws IncorrectInfoException{
        String msg = "Возраст введен некорректно: ";
        if (age > 100 || age < 0){
            msg += "указан недопустимый возраст " + age;
            throw new IncorrectInfoException(msg, age);
        }
    }
}