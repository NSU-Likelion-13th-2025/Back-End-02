package session7;

public class MethodCasting {
    public static void main(String[] args) {
        double num 10.5;

        //메서드 호출
        //전달 인수의 타입과 매개변수의 타입이 같아야 함
        printNumber((int) num);      //형 변환(타입캐스팅). int<double이라 자동 형변환이 되지 않는다
    }
    public static void printNumber(int num) {
        System.out.println("숫자 : " + n);
    }
}
