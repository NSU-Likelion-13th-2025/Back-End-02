package session5_to_6;

public class Str {
    public static void main(String[] args) {
        String a = "apple"; // String을 리터럴로 선언.
        String b = "apple"; // String 참조 변수명 = "문자열"

        System.out.println(a == b);
        // 리터럴 선언. 문자열 리터럴을 바로 입력.
        // 객체를 생성할 때 같은 문자열끼리 객체를 공유.
        // 주소값과 문자열이 같음.
    }
}
