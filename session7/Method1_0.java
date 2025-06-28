package session7;

public class Method1_0 {
    //방법1
    public static void main(String[] args) { //미리 정의된 메서드. main() 메서드
        int a = 1;
        int b = 2;
        System.out.println(a + "+" + b + "연산 수행"); // 우선 main()메서드만 출력.
    }

    //방법2
    public static int add(int a, int b) {
        //사용자 정의 메서드. add()메서드는 a,b를 매개변수로 받아 int형의 sum값을 리턴
        //매개변수 a,b에 1,2를 넣으면 동일하게 출력
        System.out.println(a+ "+" + b + "연산 수행");
        int sum = a + b;
        return sum;                         // return 리턴값;
    }

    //매개변수 a,b에 1,2 값 넣기
    //main()메소드 삭제
    //class A{
    //    public static void main(String[] args){
    //       System.out.println(Method.add(1,2));
    //    }
    //}
}