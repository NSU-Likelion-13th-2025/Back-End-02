package session7;

class A1 {
    A1() { // 생성자. 클래스명과 동일한 리턴 자료형을 정의하지 않는 메소드

    }


}

class A2 {
    int x;                                          //필드
    public static void work() {                     //메소드
        System.out.println("work");
    }

    // 기본 생성자
    // 생성자를 포함하지 않는 클래스에 컴파일러가 기본 생성자를 추가
    A2(int y) {
        x = y;                                      //필드값 선언
    }

}

//생성자와 객체의 생성 방법
//생성자 오버로딩
class A3 {
    A3() {
        System.out.println(("() 생성자"));
    }

    A3(int x) {
        System.out.println("(int x) 생성자");
    }

    A3(int x, int y) {
        System.out.println("(int x, int y) 생성자");
    }
}

public class Con {
    public static void main(String[] args) {        // 생성자 내 출력을 위한 메소드
        A3 x1 = new A3();           //A3() 생성자 호출
        A3 x2 = new A3(1);       //A3(int x) 생성자 호출
        A3 x3 = new A3(1, 2); //A3(int x, int y) 생성자 호출
    }
}