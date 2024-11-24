package thread.control.yield;

import thread.start.HelloRunnable;

import static thread.util.ThreadUtils.sleep;


public class YieldMain {

    static final int THREAD_COUNT = 1000; //1000개의 스레드

    public static void main(String[] args) {
        for (int i = 0; i < THREAD_COUNT; i++) { //1000개의 스레드 생성
            Thread thread = new Thread(new MyRunnable());
            thread.start();
        }
    }

    static class MyRunnable implements Runnable {

        @Override
        public void run() {
            for (int i = 0; i < 10000; i++) {
                System.out.println(Thread.currentThread().getName() + ":" + i);
                //sleep(1000L);
                //Thread.yield(); //Runnable 상태를 유지하는데, CPU
            }
        }
    }
}
