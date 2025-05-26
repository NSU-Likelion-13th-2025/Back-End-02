package May7;

abstract class A {// 추상 클래스 A
    abstract void abc(); // 추상 메서드
}

class B extends A {// 추상 클래스 A 상속받은 일반 클래스 B
    void abc() {
        System.out.println("방법 1. 자식 클래스 생성 및 추상 메서드 구현");
    }
}

public class AbstractClass_1{
    public static void main(String[] args) {

        //객체 생성
        A b1 = new B();

        // 메서드 호출
        b1.abc();
    }
}
