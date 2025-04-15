package session7;
public class Method1_1 {
    public static void main(String[] args) {
        int a = 5;
        int b = 3;

        int add = a + b;
        System.out.println(a + "+" + b + "= " + add); // 5+3= 8

        int min = a - b;
        System.out.println(a + "-" + b + "= " + min); //  5-3= 2

        int mult = a * b;
        System.out.println(a + "*" + b + "= " + mult); // 5*3= 15

        int div = a / b;
        System.out.println(a + "/" + b + "= " + div); // 5/3= 1
    }

    public static double add(int a, int b) {
        int add = a + b;
        System.out.println(add);
        return add;
    }

    public static double min(int a, int b) {
        int min = a - b;
        System.out.println(min);
        return min;
    }

    public static double mult(int a, int b) {
        double mult = a * b;
        System.out.println(mult);
        return mult;
    }

    public static double div(int a, int b) {
        double div = a / b;
        System.out.println(div);
        return div;
    }
}