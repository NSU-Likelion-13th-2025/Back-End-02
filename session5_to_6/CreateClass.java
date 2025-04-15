package session5_to_6;

class A{ // 클래스 A는 바로 사용할 수 없음

    int m = 5; // 변수 선언 및 초기화

    void print(){
        // 매서드 활용
        System.out.println("객체 생성 및 활용");
    }
}

public class CreateClass {
    public static void main(String[] args) {
        A a = new A();
        // new 연산자
        // 객체 생성
        a.m = 6;
        // 객체. 객체변수 = 값
        System.out.println(a.m);

        a.print();
        // 매서드 활용
    }
}
