package session8.homework;

//import : 다른 클래스를 호출할 수 있음
//패키지와 클래스 사이
import session8.homework.Student;

public class Q1 {
    public static void main(String[] args) {                        //introduce() 메서드 호출
        Student student1 = new Student();          // 객체 생성
        student1.introduce();                      // 메서드 호출

        //student2에는 본인의 이름, 나이 학번을 입력
        Student student2 = new Student();
        student2.introduce("최연우", 25, "25102583");        //introduce(String, int, String) 메서드 호출
    }
}
