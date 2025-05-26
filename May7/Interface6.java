package May7;

interface A6{
    void abc();
    default void bcd(){
        System.out.println("A6 인터페이스의 bcd()");
    }
}
class B6 implements A6{
    @Override
    public void abc() {
        System.out.println("B6 클래스의 abc()");
    }
}

public class Interface6 {
    public static void main(String[] args) {
        A6 a6 = new B6();
        a6.abc();
        a6.bcd();
    }
}
