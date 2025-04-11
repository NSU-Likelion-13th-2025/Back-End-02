public class Main_4 {
    public static void main(String[] args) {
        int a = 7; // 변수 선언 및 초기화. 00000111
        int result1 = a << 2; // 00011100 = 4+8+16 = 28
        int b = -5; // 11111011
        int result2 = b >> 2; // 11111110
        int c = 15; // 00001111
        int result3 = c >>> 2; // 00000011

        System.out.println("7 << 2 =" + result1); // 출력
        System.out.println("-5 >> 2 =" + result2);
        System.out.println("15 >>> 2 =" + result3);
    }
}
