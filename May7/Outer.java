package May7;

public class Outer {
    static interface InnerInterface {
        void greet();
    }

    static class Implementor implements InnerInterface {
        public void greet() {
            System.out.println("Greeting from inner interface implementor!");
        }
    }

    public static void main(String[] args) {
        Outer.Implementor obj = new Implementor();
        obj.greet();
    }
}
