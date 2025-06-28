package session7;

import org.w3c.dom.ls.LSOutput;

public class Method1_2 {
    //방법2
    public static int add(int a, int b) { // 두 매개변수를 압력받아 int형을 리턴하는 add라는 정적 메소드
        System.out.println(a + "+" + b + " 연산 수행");
        int sum = a + b;
        System.out.println(a + "+" + b + " 결과 = " + sum);
        return sum;                      // sum값을 리턴한다
    }

    //바로 호출
    public static void main(String[] args) {
        int sum1 = add(1, 2);       // add가 정적 메소드이므로 객체를 생성하지 않고 매서드 활용
        int sum2 = add(10, 20);

        //선택 호출
        System.out.println(sum2); //30
    }
}