/*
Task 4.
Дан номер года (положительное целое число). Определить количество дней в этом году,
учитывая, что обычный год насчитывает 365 дней, а високосный — 366 дней.
Високосным считается год, делящийся на 4, за исключением тех годов, которые делятся
на 100 и не делятся на 400 (например, годы 300, 1300 и 1900 не являются високосными,
а 1200 и 2000 — являются).
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int srcYear;

        int con_365 = 365;
        int con_366 = 366;
        int days;

        System.out.print("Enter Year: ");
        srcYear = scan.nextInt();

        if ((srcYear % 4) == 0 && !((srcYear % 100) == 0 && (srcYear % 400) != 0)) {
            days = con_366;
        } else {
            days = con_365;
        }

        System.out.print("This year has " + days + " days");

    }
}