package thread.start;

import static thread.util.MyLogger.log;

/**
 * 익명 클래스
 * 특정 메서드 안에서만 쓰고 싶을때 사용
 *
 * - 리팩토링
 */
public class InnerRunnableMainV4 {

    public static void main(String[] args) {
        log("main() start");

        Thread t1 = new Thread(() -> log("run() start"));
        t1.start();

        log("main() end");
    }
}
