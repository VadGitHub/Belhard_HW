
/*
Task 7.
Даны два целых числа: D (день) и M (месяц), определяющие правильную дату.
Вывести знак Зодиака, соответствующий этой дате:
«Водолей» (20.1–18.2), «Рыбы» (19.2–20.3), «Овен» (21.3–19.4),
«Телец» (20.4–20.5), «Близнецы» (21.5–21.6), «Рак» (22.6-22.7),
«Лев» (23.7–22.8), «Дева» (23.8–22.9), «Весы» (23.9–22.10),
«Скорпион» (23.10–22.11), «Стрелец» (23.11–21.12), «Козерог» (22.12–19.1).
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int D, M;
        String sZodiac = "";
        Scanner scan = new Scanner(System.in);

        System.out.println("Узнайте знак Зодиака.");

        do {
            System.out.print("Введите номер месяца (1-12): ");
            M = scan.nextInt();
        } while (M < 1 || M > 12);

        do {
            System.out.print("Введите номер дня (1-31): ");
            D = scan.nextInt();
        } while (D < 1 || D > 31);

        switch (M) {
            case 1:
                if (D < 20) {
                    sZodiac = "Козерог";
                } else {
                    sZodiac = "Водолей";
                }
                break;
            case 2:
                if (D < 19) {
                    sZodiac = "Водолей";
                } else {
                    sZodiac = "Рыбы";
                }
                break;
            case 3:
                if (D < 21) {
                    sZodiac = "Рыбы";
                } else {
                    sZodiac = "Овен";
                }
                break;
            case 4:
                if (D < 20) {
                    sZodiac = "Овен";
                } else {
                    sZodiac = "Телец";
                }
                break;
            case 5:
                if (D < 21) {
                    sZodiac = "Телец";
                } else {
                    sZodiac = "Близнецы";
                }
                break;
            case 6:
                if (D < 22) {
                    sZodiac = "Близнецы";
                } else {
                    sZodiac = "Рак";
                }
                break;
            case 7:
                if (D < 23) {
                    sZodiac = "Рак";
                } else {
                    sZodiac = "Лев";
                }
                break;
            case 8:
                if (D < 23) {
                    sZodiac = "Лев";
                } else {
                    sZodiac = "Дева";
                }
                break;
            case 9:
                if (D < 23) {
                    sZodiac = "Дева";
                } else {
                    sZodiac = "Весы";
                }
                break;
            case 10:
                if (D < 23) {
                    sZodiac = "Весы";
                } else {
                    sZodiac = "Скорпион";
                }
                break;
            case 11:
                if (D < 23) {
                    sZodiac = "Скорпион";
                } else {
                    sZodiac = "Стрелец";
                }
                break;
            case 12:
                if (D < 22) {
                    sZodiac = "Стрелец";
                } else {
                    sZodiac = "Козерог";
                }
                break;
        }

        System.out.println("Знак Зодиака: " + sZodiac);
    }
}