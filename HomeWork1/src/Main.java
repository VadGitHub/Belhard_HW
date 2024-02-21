
/* Task
    Объявить три переменные a, b и c.
    Присвоить каждой из них любое значение,
    вывести на экран сумму и разность b с остальными переменными
*/

public class Main {
    public static void main(String[] args)
    {
        //Define and init vars a, b, c
        int a = 100, b = 50 , c = 25;

        //Output all vars with values
        System.out.println("a = " + a + "; b = " + b + "; c = " + c);

        //Output Sum with b
        System.out.println("a + b = " + (a + b));
        System.out.println("c + b = " + (c + b));

        //Output Subtract from b
        System.out.println("b - a = " + (b - a));
        System.out.println("b - c = " + (b - c));

    }
}