package session7;

public class MethodOverroding {
    public static int add(int a, int b) {                   //메서드1
        System.out.println("int a, int b");
        return a+b;
    }

    public static double add(double a, double b) {          //메서드2
        System.out.println("int a, int b");
        return a+b;
    }

    public static String add(String a) {                    //메서드3
        System.out.println("String");
        return a;
    }

    //메서드1-3 모두 메서드 명이 동일
    public static void main(String[] args) {
        add(1, 2);                  //add(int, int)이므로 메서드1 활용
        add(1.1, 2.1);              //add(double, double)이므로 메서드2 활용
        add("a");                         //add(String)이므로 메서드3 활용
        //모두 정적 메서드로 객체 생성이 불필요
        //메서드 오버로딩을 통해 이름을 절약할 수 있다
    }
}
