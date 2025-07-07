package session9_to_11.firstPackage;

public class Main {
    // 접근제어자

    public static int a;                       //같은 클래스, 같은 패키지, 다른 패키지의 자식클래스, 다른 패키지의 모든 클래스
    protected static int b;                    // 같은 클래스, 같은 패키지, 다른 패키지의 자식클래스
    static int c;                              // (default) 같은 클래스, 같은 패키지
    static private int d;                      // 같은 클래스

    void abc() {
        //a, b, c, d 사용 가능
    }
}
