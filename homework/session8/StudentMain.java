package homework.session8;

class Student{
    String name;
    int age;
    String studentId;

    /* 기본 생성자 */
    public Student(){
 
    }

    /* 매개변수 가진 생성자 */
    public Student(String name, int age, String stdId){
   
    }
   

    /* 정보출력 메서드 */
    void introduce(){
       
    }
}

public class StudentMain {
    public static void main(String[] args){
        Student student1 = new Student();
        student1.introduce();

        System.out.println();

        Student student2= new Student("자바",25, "id2022");
        student2.introduce(); 
    }   
}