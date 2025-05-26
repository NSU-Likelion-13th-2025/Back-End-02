package May7;

class MyClass<T>{
    private T t;
    public T get(){
        return t;
    }

    public void set(T t){
        this.t = t;
    }
}

public class SingleGeneric {
    public static void main(String[] args) {
        MyClass<String> a = new MyClass<String>(); // 선언방법1
        a.set("안녕하세요");
        System.out.println(a.get());
        MyClass<Integer> mc2 = new MyClass<>(); // 선언방법2
        mc2.set(100);
        System.out.println(mc2.get());
    }
}
