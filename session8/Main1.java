// anotherPackage로 지정하지 않음
package session8;

//import는 패키지와 클래스 사이 선언
import session8.testPackage.Example01;


public class Main1 {
    public static void main(String[] args) {
        //객체를 생성해 메소드 호출
        Example01 example01 = new Example01();
        example01.print();                          //import : '타 패키지에 있는 클래스의 메소드를 호출(방법2)'

        //클래스 이름의 전체 경로 이름 사용 : 타 패키지에 있는 메소드 호출(방법1)
        session8.anotherPackage.Example01 example01_a = new session8.anotherPackage.Example01(); // 객체 생성
        example01_a.print();                                                                     // 메소드 호출
    }
}
