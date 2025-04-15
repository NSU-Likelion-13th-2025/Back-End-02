package session5_to_6;

public class Re {
    public static void main(String[] args) {
        int a = 10; // 변수 선언 및 초기화. 기본 자료형
        int b = a; // b = 10. 같은 객체 값을 가짐. 기본 자료형
        b = 20; // b = 20 로 재할당
        System.out.println(a); // 결과: 10

        String str1 = "hello"; // str(문자열) -> 참조 자료형
        String str2 = str1; // str2 = hello
        str2 = "world"; // 문자열 "world"를 재할당
        System.out.println(str1); // 결과 : hello
    }
}
