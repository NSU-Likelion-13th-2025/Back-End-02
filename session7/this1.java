package session7;

class A {
    int a;
    int b;

    void init(int a, int b) {
        a = a;
        b = b;
    }

    void work() {
        this.init(a, b);
    }
}

public class this1 {
    public static void main(String[] args) {
        A a = new A();
        a.work();
        System.out.println(a.a);
        System.out.println(a.b);
    }
}
