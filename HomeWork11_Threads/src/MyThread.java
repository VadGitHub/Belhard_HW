public class MyThread implements Runnable {

    Thinker thinker;

    public MyThread() {
    }

    public MyThread(Thinker thinker) {
        this.thinker = thinker;
    }

    @Override
    public void run() {
        System.out.println(thinker.getName() + " сел за стол");

        //Основной цикл повторений действий Философа в потоке
//            while (!Thread.currentThread().isInterrupted()){
        for (int i = 0; i < Resources.numIterationForThinker; i++) {

            synchronized (Resources.hands) {
                //Если место свободно (вилки слева и справа не заняты)
                if (thinker.isPlaceFree()){
                    thinker.setMyHands(true);
                    thinker.sayEating();
                }else {
                    thinker.sayThinking();
                }
            }

            try {
                Thread.sleep(Resources.timeForEatOrThink);//время на еду или мышление

            } catch (InterruptedException ex) {
                System.out.println("Прерван спящий поток" + thinker.getName());
                ex.printStackTrace();
            }

            //освобождаю свои руки либо продолжаю держать свободными
            thinker.setMyHands(false);

        }
//            }
        System.out.println(thinker.getName() + " покинул стол");
    }
}
