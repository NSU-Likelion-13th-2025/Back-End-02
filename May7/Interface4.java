package May7;

interface A4 { // 추상 클래스 A
    int a = 3;
    void abc();
}

class B4 implements A4 {

    public void abc() {
        System.out.println("방법 1. 자식 클래스 생성자로 객체 생성");
    }
}

public class Interface4 {
    public static void main(String[] args) {
        A4 b1 = new B4();
        A4 b2 = new B4();

        b1.abc();
        b2.abc();
    }
}
