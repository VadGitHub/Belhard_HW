/*
Создать программу, проверяющую и сообщающую на экран, является ли целое число,
записанное в переменную n, чётным либо нечётным
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n, mod;
        Scanner scan = new Scanner(System.in);

        System.out.printf("Enter Number: ");
        n = scan.nextInt();

        mod = n % 2;

        if (mod == 0){
            System.out.println("Number " + n + " is Even");
        } else {
            System.out.println("Number " + n + " is Odd");
        }

    }
}