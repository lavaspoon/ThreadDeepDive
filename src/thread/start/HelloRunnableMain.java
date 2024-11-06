package thread.start;

public class HelloRunnableMain {

    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName() + ": main() start");
        //Thread를 상속받아서 했던것과 비슷하지만, 작업과 쓰레드 객체를 분리한 점이 다르다.
        HelloThread runnable = new HelloThread();
        Thread thread = new Thread(runnable);
        thread.start();

        System.out.println(Thread.currentThread().getName() + ": main() end");

    }
}
