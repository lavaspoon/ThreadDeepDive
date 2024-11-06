package thread.start;

public class DeamonThreadMain {

    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName() + ": main() start()");
        DaemonThread dt = new DaemonThread();
        dt.setDaemon(false); //데몬 스레드 여부
        dt.start();
        System.out.println(Thread.currentThread().getName() + ": main() end()");
    }

    static class DaemonThread extends Thread {

        //10초간 실행되고 종료되는 데몬 쓰레드
        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName() + ": run()");
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + ": end()");
        }
    }
}
