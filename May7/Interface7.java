package May7;

interface A7 {
    default void abc() {
        System.out.println("A 인터페이스의 abc()");
    }
}

class B7 implements A7 {
    public void abc() {
        A7.super.abc();
        System.out.println("B클래스의 abc()");
    }
}

public class Interface7 {
    public static void main(String[] args) {
        B7 b1 = new B7();
        b1.abc();
    }
}
