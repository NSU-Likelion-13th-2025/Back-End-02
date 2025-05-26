package May19;

class MyThread extends Thread {
    public void run() {
        System.out.println("MyThread가 실행됩니다.");
    }
}

public class Thread1 {
    public static void main(String[] args) {
        MyThread t1 = new MyThread(); // 쓰레드 객체 생성
        t1.start(); // 쓰레드 시작
        System.out.println("main 메서드 실행 중...");
    }
}
