/*
Exercise 7. Task 2
Регулярное выражение, описывающее ссылку
Создать программу, которая, используя регулярное выражение,
умеет в тексте распознавать ссылку, заканчивающуюся на .com.
Текст можно вводить с клавиатуры

 */

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String inputTxt = "";
        String linkPattern = "https?://(www\\.)?\\w+\\.com";

        //этот шаблон тоже годится:
        //String linkPattern = "http[s]?://([w]{3}\\.)?\\w+\\.com";

        System.out.println("Введите текст:");
        inputTxt = scan.nextLine();

        Pattern pattern = Pattern.compile(linkPattern);
        Matcher matcher = pattern.matcher(inputTxt);

        while (matcher.find()){
            System.out.println(matcher.group());

        }

    }
}