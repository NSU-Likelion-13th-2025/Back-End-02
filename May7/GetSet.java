package May7;

class Example{
    // 이름, 전공, 학번 필드 생성
    private String name;
    private String major;
    private int studentId;

    public String getName() {
        return name;
    }

    public String getMajor() {
        return major;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public Example(String name,String major,int studentId){
        setName(name);
        setMajor(major);
        setStudentId(studentId);
    }

    void printinfo(){
        System.out.println("이름 : " + getName() + " \n전공 : " + getMajor() + " \n학번 : " + getStudentId() + "\n ---------------");
    }
}



public class GetSet {
    public static void main(String[] args) {
        Example a = new Example("홍길동", "경영학과", 20101010);
        Example b = new Example("아무개", "간호학과", 22102912);
        a.printinfo();
        b.printinfo();
    }
}
