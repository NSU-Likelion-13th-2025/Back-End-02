package session5_to_6;              //패키지. 클래스의 외부구성요소

import java.math.BigDecimal;        //import는 패키지와 클래스 사이에 위치합니다. 클래스의 외부구성요소
import java.math.RoundingMode;      //반올림과 나누기 기능을 사용하기위해 각각 임포트

public class Class6 {
    public static void main(String[] args) {                // 메소드. 클래스의 외부 구성 요소
        BigDecimal num1 = new BigDecimal("13");         //다른 패키지의 클래스를 사용하기위에 위에 import해서
        BigDecimal num2 = new BigDecimal("5");          //BigDecimal클래스의 생성자를 만들 수 있음

        // num1을 num2로 나누고 소수점 2자리까지 반올림
        BigDecimal result = num1.divide(num2, 2, RoundingMode.HALF_UP);

        System.out.println("결과: " + result);
    }
}
