
/*
Task 3.
Даны три числа, каждое в своей переменной. Найти сумму двух наибольших из них
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean noExit = true;
        Scanner scan = new Scanner(System.in);
        int A, B, C;
        int Sum;
        char max1, max2;

        System.out.print("Enter number A: ");
        A = scan.nextInt();
        System.out.print("Enter number B: ");
        B = scan.nextInt();
        System.out.print("Enter number C: ");
        C = scan.nextInt();

        if (A <= B && A <= C) {
            max1 = 'B';
            max2 = 'C';
            Sum = B + C;
        } else if (B <= A && B <= C) {
            max1 = 'A';
            max2 = 'C';
            Sum = A + C;
        } else {
            max1 = 'A';
            max2 = 'B';
            Sum = A + B;
        }

        System.out.print("Maximum Sum " + max1 + " + " + max2 + " = " + Sum);

    }
}