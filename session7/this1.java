package session7;

class A {
    // 필드
    int a; //멤버변수 a
    int b; //멤버변수 b

    // 메소드를 통한 필드값 선언
    void init(int a, int b) {       //매개변수 a, b
        //this : 멤버 변수명과 매개 변수명이 동일
        this.a = a;
        this.b = b;
    }

    // 메소드를 통한 필드값 선언
    void work() {
        this.init(2, 3);        // this : 자신의 객체에 접근
    }
}

public class this1 {
    public static void main(String[] args) {
        A a = new A();
        a.work();
        System.out.println(a.a);
        System.out.println(a.b);
    }
}
