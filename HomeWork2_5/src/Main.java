/*
Task 5.
Арифметические действия над числами пронумерованы следующим образом:
1 — сложение, 2 — вычитание, 3 — умножение, 4 — деление.
Дан номер действия N (целое число в диапазоне 1–4) и вещественные числа A и B (В не равно 0).
Выполнить над числами указанное действие и вывести результат.
*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numOper = 1; //default = 1
        double A, B;
        double result = 0;

            System.out.println("Operations: 1 - '+'; 2 - '-'; 3 - '*'; 4 - '/' ");
            do {
                System.out.print("Please, choose number of Operation: ");
                numOper = scan.nextInt();
            }while ( numOper < 1 || numOper > 4 );

            System.out.print("Enter float number A: ");
            A = scan.nextDouble();
            do {
                System.out.print("Enter float number B (except 0): ");
                B = scan.nextDouble();
            }while (B == 0);

            switch (numOper){
                case 1:
                    result = A + B;
                    break;
                case 2:
                    result = A - B;
                    break;
                case 3:
                    result = A * B;
                    break;
                case 4:
                    result = A / B;
                    break;
            }

        System.out.print("Result of Operation with A and B is: " + result);

    }
}