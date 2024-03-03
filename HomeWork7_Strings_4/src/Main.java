/*
Exercise 7. Task 4
Дана строка 'ab abab abab abababab abea'.
Напишите регулярное выражение, которое найдет строки по шаблону:
строка 'ab' повторяется 1 или более раз.
 */

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String inputText = "ab abab abab abababab abea";
        String linePattern = "(ab)+";

        Pattern pattern = Pattern.compile(linePattern);
        Matcher matcher = pattern.matcher(inputText);

        while (matcher.find()){
            System.out.println(matcher.group());
        }
    }
}