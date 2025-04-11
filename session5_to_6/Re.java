package session5_to_6;

public class Re {
    public static void main(String[] args) {
        int a = 10; // 변수 선언및 초기화
        int b = a; // b = 10
        b = 20; // b = 20 로 재할당
        System.out.println(a); // 결과: 10

        String str1 = "hello"; // str(문자열), ""안에 hello
        String str2 = str1; // str2 = hello
        str2 = "world";
        System.out.println(str1); // 결과 : hello
    }
}
