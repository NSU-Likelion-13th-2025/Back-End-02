//package session7;
//
//class MyClass {
//
//    static int classVariable = 0;
//    // 클래스 변수 -> static
//    int instanceVariable;
//    // 변수 선언
//
//    public MyClass(int value) {
//        instanceVariable = value;
//        // 인스턴스 변수 -> static xx
//    }
//}

//public class A {
//    public static void main(String[] args) {
//        // 인스턴스 생성
//        MyClass obj1 = new MyClass(10);
//        MyClass obj2 = new MyClass(20);
//
//        // 클래스 변수는 모든 인스턴스가 공유
//        // 접근 : 클래스명.클래스변수명
//        MyClass.classVariable = 100;
//
//        // 클래스 변수 출력
//        // 모든 인스턴스가 공유
//        // obj1.classVariable = obj2.classVariable
//        System.out.println("obj1 class variable: " + obj1.classVariable);
//        System.out.println("obj2 class variable: " + obj2.classVariable);
//
//        // 인스턴스 변수는 각 인스턴스마다 다름
//        // obj1.instanceVariable != obj2.instanceVariable
//        System.out.println("obj1 instance variable: " + obj1.instanceVariable);
//        System.out.println("obj2 instance variable: " + obj2.instanceVariable);
//    }
//}
