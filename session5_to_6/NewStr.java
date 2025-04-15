package session5_to_6;

public class NewStr {
    public static void main(String[] args) {
        String a = new String("apple"); // String을 객체로 선언
        String b = new String("apple"); // String 참조 변수명 = new String("문자열")

        System.out.println(a == b);
        // false
        // heap 영역에 문자열'은' 같은 서로 다른 객체가 생성
        // 주소값이 다름.
    }
}
