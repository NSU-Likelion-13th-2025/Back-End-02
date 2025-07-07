package session8.homework;

// 중괄호 내부만 채우기. 메서드 추가하지 않기
class Student{
    String name;
    int age;
    String studentId;

    /* 기본 생성자 */
    public Student(){           // class명과 동일
    this.name = "홍길동";
    this.age = 20;
    this.studentId = "25123456";
    }

    /* 매개변수 가진 생성자 */
    public Student(String name, int age, String studentId){
    this.name = name;
    this.age = age;
    this.studentId = studentId;
    }


    /* 정보출력 메서드 */
    void introduce(){
        System.out.println("학생 이름: " + name);
        System.out.println("학생 나이: " + age);
        System.out.println("학생 학번: " + studentId);
    }
}

// 수정하지 말기
public class StudentMain {
    public static void main(String[] args){
        Student student1 = new Student();
        student1.introduce();

        System.out.println();

        Student student2= new Student("자바",25, "id2022");
        student2.introduce();
    }
}