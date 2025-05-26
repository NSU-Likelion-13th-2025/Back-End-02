package May7;

interface A5 { // 추상 클래스A
    int a = 3;
    void abc();
}

public class Interface5 {
    public static void main(String[] args) {
        A5 a1 = new A5() {
            public void abc() {
                System.out.println("방법2. 익명 이너 클래스를 이용한 객체 생성");
            }
        };
        A5 a2 = new A5() {
            public void abc() {
                System.out.println("방법2. 익명 이너 클래스를 이용한 객체 생성");
            }
        };

        a1.abc();
        a2.abc();
    }
}
