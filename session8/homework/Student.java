package session8.homework;

// default 접근제어자
// 같은 패키지내 다른 클래스 접근 가능
class Student{

    //필드 선언
    String name;
    int age;
    String studentId;

    //메소드
    //필드값 초기화
    //(조건 2)생성자 오버로딩. 생성자명 동일
    void introduce(){                                           //introduce() 메서드
        //(조건3) 정보 출력 메서드 이름은 introduce를 사용.
        System.out.println("학생 이름: 홍길동");
        System.out.println("학생 나이: 20");
        System.out.println("학생 학번: 25123456");
    }

    void introduce(String name, int age, String studentId){     //introduce(String, int, String) 메서드
        //(조건1) 변수의 이름은 name, age, studentId만 사용합니다
        //this : 멤버변수명 == 매개변수명
        this.name = name;
        this.age = age;
        this.studentId = studentId;

        System.out.println("학생 이름: " + name);
        System.out.println("학생 나이: " + age);
        System.out.println("학생 학번: " + studentId);
    }
}
