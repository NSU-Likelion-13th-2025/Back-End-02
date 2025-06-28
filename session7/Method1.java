package session7;

import org.w3c.dom.ls.LSOutput;

public class Method1 {
    public static void main(String[] args) { //미리 정의된 메서드. main() 메서드
        int a = 1;
        int b = 2;
        System.out.println(a + "+" + b + "연산 수행"); // main()메서드만 출력
    }

    public static int add(int a, int b) {
        //사용자 정의 메서드. add()메서드는 a,b를 매개변수로 받아 int형의 sum값을 리턴
        System.out.println(a+ "+" + b + "연산 수행");
        int sum = a + b;
        return sum;                         // return 리턴값;
    }
}