package session7;

public class Method1_5 {
    public static void main(String[] args) {
        int num = 10;

        printNumber(num);
    }

    public static void printNumber(double n) {
        // 메서드의 매개변수가 상위 타입인 경우에 자동 형변환
        // int < double
        System.out.println("숫자 : " + n);
    }
}
