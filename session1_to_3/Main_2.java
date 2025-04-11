package session1_to_3;

public class Main_2 {
    public static void main(String[] args) {
        int a = 5, b = 0; // 변수 선언 및 초기화
        b = a++; // 증감 연산자. 코드 실행 중에는 b = a, 코드 실행 후에는 b = a + 1
        System.out.println("b=a++; 실행 후, a=" + a + ", b=" + b); // b=a++; 실행 후, a=6, b=5 출력

        int c = 5, d = 0; //변수 선언 및 초기화
        d = ++c; // 증감 연산자. 코드 실행 전에 증가
        System.out.println("d=c++; 실행 후, c=" + c + ", d=" + d); // d=c++; 실행 후, c=6, d=6 출력
    }
}
