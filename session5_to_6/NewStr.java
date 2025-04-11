package session5_to_6;

public class NewStr {
    public static void main(String[] args) {
        String a = new String("apple"); // 변수 선언 및 할당
        String b = new String("apple");

        System.out.println(a == b); // string은 문자열 리터럴을 바로 입력 -> 객체 생성시 같은 문자열끼리 객체를 공유
    }
}
