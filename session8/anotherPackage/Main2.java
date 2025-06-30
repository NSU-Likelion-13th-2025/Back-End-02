package session8.anotherPackage; //anotherPackage로 지정

public class Main2 {
    public static void main(String[] args) {
        //다른 패키지의 클래스 사용 (방법2)
        //클래스이름의 전체경로(패키지.클래스)를 사용
        session8.testPackage.Example01 example01 = new session8.testPackage.Example01(); // 메서드 호출을 위한 객체 생성
        example01.print();                                                               // 객체의 메소드 호출
    }
}
