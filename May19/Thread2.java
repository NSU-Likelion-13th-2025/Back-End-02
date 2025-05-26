package May19;

class MyRunnable implements Runnable{
    public void run() {
        System.out.println("Runnable 쓰레드 실행 중...");
    }
}

public class Thread2 {
    public static void main(String[] args) {
        Thread t2 = new Thread(new MyRunnable()); // Thread에 Runnable 전달
        t2.start();
        System.out.println("main 메서드 실행 중...");
    }
}
