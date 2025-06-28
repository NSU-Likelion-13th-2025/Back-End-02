package session7;

public class Method2_2 {

    public static double add(int a, int b) { // 접근제어자 정적 리턴자료형 메소드명(매개변수) {...}
        int add = a+b;
        System.out.println(add); //정적 메소드이므로 활용시 객체 생성이 불필요
        return add; // return 리턴값. int -> double 자동형변환
    }

    public static double min(int a, int b) {
        int min = a-b;
        System.out.println(min);
        return min;
    }

    public static double mult(int a, int b) {
        int mult = a*b;
        System.out.println(mult);
        return mult;
    }

    public static double div(int a, int b) {
        int div = a/b;
        System.out.println(div);
        return div;
    }
}
