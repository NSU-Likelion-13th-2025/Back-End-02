public class Main_9 {
    public static void main(String[] args) {

        int a = (true)? 1:2; // 조건식 (true)가 참. 1이 변수 a에 할당.
        System.out.println(a);

        int b = (a % 2 == 0)? 10 : 20; // 조건식이 false이므로 20이 변수 b에 할당.
        System.out.println(b);
    }
}
