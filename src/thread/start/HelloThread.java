package thread.start;

public class HelloThread extends Thread {

    public HelloThread() {
        System.out.println("HelloThread 객체 생성됨");
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " run()");
    }
}
