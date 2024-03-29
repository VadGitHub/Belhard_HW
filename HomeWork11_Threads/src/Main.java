/*
Пять безмолвных философов сидят вокруг круглого стола,
перед каждым философом стоит тарелка спагетти.
Вилки лежат на столе между каждой парой ближайших философов.
Каждый философ может либо есть, либо размышлять. Приём пищи
не ограничен количеством оставшихся спагетти — подразумевается
бесконечный запас. Тем не менее, философ может есть только тогда,
когда держит две вилки — взятую справа и слева.
Каждый философ может взять ближайшую вилку (если она доступна) или
положить — если он уже держит её. Взятие каждой вилки и возвращение
её на стол являются раздельными действиями, которые должны выполняться
одно за другим.
Вопрос задачи заключается в том, чтобы разработать модель поведения
(параллельный алгоритм), при котором ни один из философов не будет голодать,
то есть будет вечно чередовать приём пищи и размышления.
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Задайте количество философов за столом: ");
        int numOfThinkers = scan.nextInt();

        Resources.hands = new int[numOfThinkers][2];

        //Создание и заполнение списка Философов
        List<Thinker> thinkerList = new ArrayList<>();
        for (int i = 0; i < numOfThinkers; i++) {
            String nameThinker = "Философ_" + (i + 1);

            thinkerList.add(new Thinker(i, nameThinker));

        }

        //Создание и заполнение списка потоков
        List<Thread> threadList = new ArrayList<>();
        for (int i = 0; i < numOfThinkers; i++) {
            String threadName = "MyThread" + (i + 1);
            threadList.add(new Thread(new MyThread(thinkerList.get(i))));
        }
//        Thread thread1 = new Thread(new MyThread(thinkerList.get(0)), "MyThread1");

        //Запуск потоков
//        thread1.start();
        for (Thread i : threadList) {
            i.start();
        }


//        }
        try {
            //ожидание завершения потоков
//    thread1.join();
            for (Thread i : threadList) {
                i.join();
            }

        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }

        System.out.println("Все ушли. Застолье окончено...");

    }
}