package session7;

class MyClass {

    static int classVariable = 0; //정적 필드 초기화
    int instanceVariable;         //인스턴스 필드 선언

    public MyClass(int value) {
        instanceVariable = value; //필드값 instanceVariable 초기화
    }
}

public class Aa {
    public static void main(String[] args) {
        // 인스턴스 생성
        MyClass obj1 = new MyClass(10); //객체 obj1 생성. 필드값인 인스턴스 변수 초기화
        MyClass obj2 = new MyClass(20); //각각의 객체는 다른 인스턴스 필드값을 가짐

        // 클래스 변수는 모든 인스턴스가 공유
        MyClass.classVariable = 100; //정적 변수

        // 클래스 변수 출력
        System.out.println("obj1 class variable: " + obj1.classVariable); //100출력
        System.out.println("obj2 class variable: " + obj2.classVariable); //100출력
        // 두 객체 모두 클래스 변수 값이 같다.

        // 인스턴스 변수는 각 인스턴스마다 다름
        // obj1.instanceVariable != obj2.instanceVariable
        System.out.println("obj1 instance variable: " + obj1.instanceVariable); //10출력
        System.out.println("obj2 instance variable: " + obj2.instanceVariable); //20출력
    }
}
