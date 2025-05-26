package May7;

class Parent{
    <T extends Number> void print(T t){
        System.out.println(t);
    }
}

class Child extends Parent{

}

public class InterfaceGeneric {
    public static void main(String[] args) {
        Parent p = new Parent();
        p.<Integer> print(100);
        p.print(200);

        Child c = new Child();
        c.<Double>print(3.4);
        c.print(1.6);
    }
}
