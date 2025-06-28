package session5_to_6;

public class Student {

    // 2-1. 필드 (클래스 속성)
    private String name;            //클래스 내부 구성요소인 필드값
    private String studentId;       //필드값 선언

    // 2-3. 생성자 (객체 생성 시 필드 초기화)
    public Student(String name, String studentId) {
        this.name = name;           //이때 this.name은 위에 선언된 필드를 의미
        this.studentId = studentId; //생성자. 객체를 생성하며 필드값을 초기화
    }

    // 2-2. 메서드 (기능)
    public String introduce() {     //접근제어자 리턴값 변수명() {...}
        return "안녕하세요, 저는 " + name + "이고 학번은 " + studentId + "입니다."; //return 리턴값(String)
    }

    public static void main(String[] args) {        //main 메서드
        // 객체 생성 및 메서드 호출
        Student student1 = new Student("김철수", "25100001"); //생성자. student1 객체 생성.
        System.out.println(student1.introduce()); // Student 클래스내 메서드 참조
    }
}
