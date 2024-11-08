package thread.start;

import static thread.util.MyLogger.log;

/**
 * 익명 클래스
 * 특정 메서드 안에서만 쓰고 싶을때 사용
 */
public class InnerRunnableMainV2 {

    public static void main(String[] args) {
        log("main() start");

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                log("run() start");
            }
        };
        Thread t1 = new Thread(runnable);
        t1.start();

        log("main() end");
    }
}
