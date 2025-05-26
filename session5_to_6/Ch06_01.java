//package session5_to_6;
//// 외부 구성요소 - 패키지.
//// 형태 : package 패키지명; 첫번째 문장
//
//import java.math.BigDecimal;
//// 외부 구성요소 - 임포트.
//// 형태 : import 패키지명.클래스명;
//import java.math.RoundingMode;
//// import -> 다른 클래스에서 BigDecimal, RoundingMode 클래스 사용
//
//public class Ch06_01 {
//    // 외부 구성요소 - class
//    // 클래스 첫글자는 대문자
//    public static void main(String[] args) {
//        // 내부 구성요소 - 메서드. void -> 리턴값 없음.
//        BigDecimal num1 = new BigDecimal("13");
//        // 객체 선언 및 초기화.
//        // BigDecimal -> int나 double보다 더 정밀한 수를 표현
//        BigDecimal num2 = new BigDecimal("5");
//        // 연산자 new
//        // ch06_01의 인스턴스(instance)가 메모리의 빈공간에 생성
//
//        // num1을 num2로 나누고 소수점 2자리까지 반올림
//        BigDecimal result = num1.divide(num2, 2, RoundingMode.HALF_UP);
//
//        System.out.println("결과: " + result);
//    }
//}
