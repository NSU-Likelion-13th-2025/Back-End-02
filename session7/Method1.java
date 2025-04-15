package session7;

public class Method1 {
    public static void main(String[] args) {
        // 미리 정의된 메서드
        int a = 1;
        int b = 2;
        System.out.println(a + "+" + b + " 연산 수행"); // 1+2 연산 수행
        int sum1 = a + b;
        System.out.println("결과1 출력:" + sum1); // 결과1 출력:3

        // 계산2
        int x = 10;
        int y = 20;
        System.out.println(x + "+" + y + " 연산 수행"); // 10+20 연산 수행
        int sum2 = x + y;
        System.out.println("결과2 출력:" + sum2); // 결과2 출력:30
    }

    public static int add(int a, int b) {
        // 사용자 정의 메서드
        System.out.println(a + "+" + b + " 연산 수행");
        int sum = a + b;
        System.out.println(a + "+" + b + " 결과 = " + sum);
        return sum; // 메서드 실행결과 반환
    }
}
