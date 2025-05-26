package May19;

public class Thread3 {
    public static void main(String[] args) {
        Thread t3 = new Thread(new Runnable() {
            public void run() {
                System.out.println("익명 Runnable 실행!");
            }
        });

        t3.start();
        System.out.println("main 메서드 실행 중...");
    }
}
