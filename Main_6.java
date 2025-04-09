public class Main_6 {
    public static void main(String[] args) {
        int a = 5;
        int b = 3;
        int c = 7;
        System.out.println((a > b) && (b == 3)); // 'a는 b보다 크다' and 'b는 3과 같다'
        System.out.println((a < b) || (c == 6)); // 'a는 b보다 작다' or 'c는 6과 같다'
        System.out.println((a==5) ^ (b > c)); // 'a는 5와 같다', 'b는 c보다 크다' 두 조건 중 하나가 참일때 나머지 하나는 거짓이여야 1
        System.out.println(!(a > b)); // a는 b보다 크지 '않다'
    }
}
