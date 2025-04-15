package session7;

public class Method1_3 {

    public static int sum(int a, int b) {
    // 매개변수 : 메서드에 전달된 입력값을 저장
        return a + b;
    }

    public static void main(String[] args) {
        Method1_3 method = new Method1_3();
        int x = method.sum(1, 2);
        // 인수 : 메서드 호출할 때 전달하는 입력값
    }
}
