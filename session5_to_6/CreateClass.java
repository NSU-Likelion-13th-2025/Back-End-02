package session5_to_6;

class A{ // 클래스 A는 바로 사용할 수 없음

    int m = 5; // 필드

    void print(){
        // 매서드 활용
        System.out.println("객체 생성 및 활용");
    }
}

public class CreateClass {
    public static void main(String[] args) {        //main 메서드
        A a = new A();          // 생성자. 객체a 생성
        a.m = 6;                // 필드값 초기화
        System.out.println(a.m);  //6출력

        a.print();              //객체a의 메서드print() 활용
    }
}
