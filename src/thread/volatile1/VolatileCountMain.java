package thread.volatile1;

import static thread.util.MyLogger.log;
import static thread.util.ThreadUtils.sleep;

public class VolatileCountMain {

    public static void main(String[] args) {
        MyTask task = new MyTask();
        Thread t = new Thread(task, "work");
        t.start();

        sleep(1000L);

        task.flag = false;
        log("flag = " + task.flag + ", count = " + task.count + "in main");

    }

    static class MyTask implements Runnable {
        //메인 스레드가 flag를 변경하는 시점에 work 스레드도 flag의 변경 값을 정확하게 확인할 수 있다.
        //volatile을 사용하면 캐시메모리가 아닌, 메인 메모리에 항상 직접 접그나기 때문에 성능이 상대적으로 떨어진다.
        volatile boolean flag = true;
        volatile long count;

        @Override
        public void run() {
            while (flag) {
                count++;
                // 1억번에 한번씩 출력
                if (count % 100_000_000 == 0) {
                    log("flag = " + flag + ", count = " + count);
                }
                log("flag = " + flag + ", count = " + count + " 종료");
            }
        }
    }
}
