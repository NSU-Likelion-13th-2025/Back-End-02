package session8.testPackage;

// 접근 제어자 default : 다른 패키지에서 import 불가능
class ExternalC{

}

// public class의 클래스명은 파일명과 동일
public class Example01 {
    public void print(){        //접근제한자가 public. 리턴값이 없는 print() 메서드
        System.out.println("session8.testPackage의 Example01에서 왔습니다!!");
    }
}
