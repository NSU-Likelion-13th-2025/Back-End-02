package May7;

abstract class C{ // 추상 클래스 C
    abstract void abc(); // 추상 메서드
}

public class AbstractClass_2 {
    public static void main(String[] args) {

        // 객체 생성
        C c1 = new C() {
            @Override
            void abc() {
                System.out.println("방법 2. 익명 이너 클래스 방법으로 객체 생성");
            }
        };

        // 메서드 호출
        c1.abc();
    }
}
