
/*
Task 2.
Создать программу, в которой проинициализировать переменную типа int,
после чего вывести на экран день недели, соответствующий этому числу (1 – понедельник, 3 – среда и тд),
если такого дня нет, вывести надпись, что такого дня нет. Сделать реализацию через if-else и через switch
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int numDay;
        boolean noExit = true;
        Scanner scan = new Scanner(System.in);

        do {

            System.out.print("Enter number of weekday (0 - exit): ");
            numDay = scan.nextInt();

            // By Switch:
            switch (numDay){
                case 1:
                    System.out.println("It's Monday");
                    break;
                case 2:
                    System.out.println("It's Tuesday");
                    break;
                case 3:
                    System.out.println("It's Wednesday");
                    break;
                case 4:
                    System.out.println("It's Thursday");
                    break;
                case 5:
                    System.out.println("It's Friday");
                    break;
                case 6:
                    System.out.println("It's Saturday");
                    break;
                case 7:
                    System.out.println("It's Sunday");
                    break;
                case 0:
                    noExit = false;
                    System.out.println("Bye!");
                    break;
                default:
                    System.out.println("Wrong weekday number!");
            }

        } while (noExit);

        // By if-else:
/*        if (numDay == 1){
            System.out.println("It's Monday");
        } else if (numDay == 2) {
            System.out.println("It's Tuesday");
        } else if (numDay == 3) {
            System.out.println("It's Wednesday");
        } else if (numDay == 4) {
            System.out.println("It's Thursday");
        } else if (numDay == 5) {
            System.out.println("It's Friday");
        } else if (numDay == 6) {
            System.out.println("It's Saturday");
        } else if (numDay == 7) {
            System.out.println("It's Sunday");
        } else {
            System.out.println("Wrong weekday number!");
        }
*/
    }
}