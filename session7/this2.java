package session7;

class B{
    B() {
        System.out.println("B() 생성자");
    }

    B(int a) {
        //this()
        //생성자 코드에서만 사용가능. 가장 윗줄 위치
        this();                      //같은 클래스에서 생성자가 다른 생성자를 호출
        System.out.println("B(" + a + ") 생성자");
    }
}

public class this2 {
    public static void main(String[] args) {
        //객체 생성
        B b1 = new B();             //B() 생성자 호출
        System.out.println();
        B b2 = new B(3);         //B(int a)생성자 호출
    }
}
