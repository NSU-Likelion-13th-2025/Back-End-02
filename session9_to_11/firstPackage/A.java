package session9_to_11.firstPackage;    // A.java와 같은 패키지

class A {
    public static void main(String[] args) {
        System.out.println(Main.a);             // public
        System.out.println(Main.b);             // protected
        System.out.println(Main.c);             // default
        // System.out.println(Main.d);          // 컴파일 에러. 다른 클래스
    }
}
