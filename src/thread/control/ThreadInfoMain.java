package thread.control;

import thread.start.HelloRunnable;

import static thread.util.MyLogger.log;

/**
 * 스레드 상태
 * NEW : 스레드가 아직 시작되지 않은 상태
 * RUNNABLE : 스레드가 실행 중이거나 실행될 준비가 된 상태
 * BLOCKED : 스레드가 동기화 락을 기다리는 상태
 * WAITING : 스레드가 다른 스레드의 특정 작업이 완료되기를 기다리는 상태
 * TIMED_WAITING : 일정 시간 동안 기다리는 상태
 * TERMINATED : 스레드가 실행을 마친 상태
 */
public class ThreadInfoMain {

    public static void main(String[] args) {
        // main 스레드
        Thread mainThread = Thread.currentThread();
        log("mainThread = " + mainThread);
        log("mainThread.getName=()=" + mainThread.getName());
        log("mainThread.getPriority=()=" + mainThread.getPriority()); //우선순위 (기본 5)
        log("mainThread.getThreadGroup()=" + mainThread.getThreadGroup());
        log("mainThread.getState()=" + mainThread.getState()); //스레드 상태

        // myThread 스레드
        Thread myThread = new Thread(new HelloRunnable(), "myThread"); //new HelloRunnable() 구현체
        log("myThread = " + myThread);
        log("myThread.getName=()=" + myThread.getName());
        log("myThread.getPriority=()=" + myThread.getPriority());
        log("myThread.getThreadGroup()=" + myThread.getThreadGroup());
        log("myThread.getState()=" + myThread.getState());
    }
}
