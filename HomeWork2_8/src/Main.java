
/*
Task 8.
Мастям игральных карт присвоены порядковые номера:
1 — пики, 2 — трефы, 3 — бубны, 4 — червы.
Достоинству карт, старших десятки, присвоены номера:
11 — валет, 12 — дама, 13 — король, 14 — туз.
Даны два целых числа:
N — достоинство (6 ≤ N ≤ 14) и
M — масть карты (1 ≤ M ≤ 4).
Вывести название соответствующей карты вида «шестерка бубен», «дама червей», «туз треф» и т. п.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N, M;
        String valueName = "", suitName = "";

        System.out.println("Масти: 1 — пики, 2 — трефы, 3 — бубны, 4 — червы");
        do {
            System.out.print("Введите номер масти (1-4): ");
            M = scan.nextInt();
        } while (M < 1 || M > 4);

        System.out.println("Номера достоинств карт, старших десятки:\n" +
                "11 — валет, 12 — дама, 13 — король, 14 — туз");
        do {
            System.out.print("Введите номер достоинства карты (6-14): ");
            N = scan.nextInt();
        } while (N < 6 || N > 14);

        switch (N) {
            case 6:
                valueName = "шестерка";
                break;
            case 7:
                valueName = "семерка";
                break;
            case 8:
                valueName = "восьмерка";
                break;
            case 9:
                valueName = "девятка";
                break;
            case 10:
                valueName = "десятка";
                break;
            case 11:
                valueName = "валет";
                break;
            case 12:
                valueName = "дама";
                break;
            case 13:
                valueName = "король";
                break;
            case 14:
                valueName = "туз";
                break;
        }

        switch (M) {
            case 1:
                suitName = "пики";
                break;
            case 2:
                suitName = "треф";
                break;
            case 3:
                suitName = "бубен";
                break;
            case 4:
                suitName = "червей";
                break;
        }
        System.out.print("Определена карта: " + valueName + " " + suitName);
    }
}