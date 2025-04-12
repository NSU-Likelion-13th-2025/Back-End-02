package session5_to_6; // package 패키지명; 첫번째 문장

import java.math.BigDecimal; // import  패키지명.클래스명; 소스파일에 사용된 클래스 패키지 정보 제공
import java.math.RoundingMode;

public class ch06_01 { // public -> 클래스 선언부, 접근제어자(access modifier). 접근 제한 없음.
    public static void main(String[] args) { // 클래스변수(static멤버변수)는 인스턴스 관계없이  같은 값
        BigDecimal num1 = new BigDecimal("13"); // 변수 선언 및 초기화. int나 double보다 더 정밀한 수를 표현
        BigDecimal num2 = new BigDecimal("5");

        // num1을 num2로 나누고 소수점 2자리까지 반올림
        BigDecimal result = num1.divide(num2, 2, RoundingMode.HALF_UP);

        System.out.println("결과: " + result);
    }
}
