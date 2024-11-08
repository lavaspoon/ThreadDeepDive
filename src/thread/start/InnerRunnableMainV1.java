package thread.start;

import static thread.util.MyLogger.log;

/**
 * 정적 중첩 클래스
 */
public class InnerRunnableMainV1 {

    public static void main(String[] args) {
        log("main() start");

        MyRunnable myRunnable = new MyRunnable();
        Thread t1 = new Thread(myRunnable);
        t1.start();

        log("main() end");
    }

    static class MyRunnable implements Runnable {
        @Override
        public void run() {
            log("run() start");
        }
    }
}
