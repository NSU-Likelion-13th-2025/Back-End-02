package session7;

public class Method1_4 {
    public static void main(String[] args) {
        double num = 10.5;

        printNumber((int)num);
        // 명시적 형변환 : 전달인수 타입 = 매개변수 타입 이어야 매서드 호출
    }

public static void printNumber(int n) {
    System.out.println("숫자 : " + n);
}
}
