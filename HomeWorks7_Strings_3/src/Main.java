/*
Exercise 7. Task 3
Дана строка 'ahb acb aeb aeeb adcb axeb'. Напишите регулярное выражение,
которое найдет строки ahb, acb, aeb по шаблону: буква 'a', любой символ, буква 'b'.
 */


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String inputText = "ahb acb aeb aeeb adcb axeb";
        String linePattern = "a.{1}b";

        Pattern pattern = Pattern.compile(linePattern);
        Matcher matcher = pattern.matcher(inputText);

        while (matcher.find()){
            System.out.println(matcher.group());
        }

    }
}