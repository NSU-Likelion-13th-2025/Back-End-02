package session9_to_11.secondPackage;

import session9_to_11.firstPackage.*;           // 다른 패키지를 활용

import java.sql.SQLOutput;

class B {
    public static void main(String[] args) {
        System.out.println(Main.a);
        // System.out.println(Main.b);              // 에러. protected -> 다른 패키지, 상속받아야 가능
        // System.out.println(Main.c);              // 에러. default -> import 불가능
    }

}
