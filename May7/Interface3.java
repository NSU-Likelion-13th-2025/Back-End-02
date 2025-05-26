package May7;

class D3 implements A3 {
    public void a3() {
    }
}

class E3 implements A3, B3 {
    public void a3() {
    }
    public void b3() {
    }
}

class F3 extends D3 implements A3, C3 {
    public void c3() {
    }
}

public class Interface3 {
    public static void main(String[] args) {
        System.out.println(A3.a3);
        System.out.println(B3.b3);
        System.out.println(C3.c3);
    }
}
