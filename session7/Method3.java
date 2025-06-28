package session7;

public class Method3 {
    //매개변수 a, b
    //메서드에 전달된 입력값을 저장하는 변수
    public static int sum(int a, int b){
        return a+b;
    }

    //인수
    //메서드를 호출할 때 전달하는 입력값
    public static void main(String[] args) {
        Method3 method = new Method3(); //생성자. method객체 생성
        int x = method.sum(1, 2); //매서드 활용
    }
}
