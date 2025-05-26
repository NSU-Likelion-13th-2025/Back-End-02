package May7;

interface A2{
    public static final int a2 = 3;
    public abstract void abc();
}
interface B2{
    public static final int b2 = 4;
    public abstract void bcd();
}

public class Interface2 {
    public static void main(String[] args) {
        System.out.println(A2.a2);
        System.out.println(B2.b2);
    }
}
