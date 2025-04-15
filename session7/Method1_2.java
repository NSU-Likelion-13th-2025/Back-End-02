package session7;

public class Method1_2 {
    // 메서드 오버로딩
    // 의미 : 같은 이름의 메서드를 매개변수의 개수 또는 타입을 다르게 하여 정의
    // 장점 : 이름 절약 가능
    public static void main(String[] args) {
        add(1, 2);
        add(1.1, 2.1);
        add("a");
    }
    public static int add(int a, int b) {
    System.out.println("int a, int b");
    return a + b;
    }

    public static double add(double a, double b) {
        System.out.println("double a, double b");
        return a + b;
    }

    public static String add(String a) {
        System.out.println("String a");
        return a;
    }
}
