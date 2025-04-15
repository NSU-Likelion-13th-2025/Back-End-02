//import TestPackage.Example01;
// import anotherPackage.Example01;

public class Main {
    public static void main(String[] args) {
        testPackage.Example01 example01 = new testPackage.Example01();
        //Example01 example01 = new Example01();
        example01.print();

        // 두 개 이상 임포트 불가
        // anotherPackage.Example01 example01_a = new anotherPackage.example();
        // exampl301_a.print();
    }
}
