package thread.ex01;

import static thread.util.MyLogger.log;

public class ex01Main {

    public static void main(String[] args) {
        CounterThread t1 = new CounterThread();
        t1.start();
    }

    static class CounterThread extends Thread{

        @Override
        public void run() {
            for (int i = 1; i <= 5; i++) {
                log("value: " + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
