package session1_to_3;

public class Main_3 {
    public static void main(String[] args) {
        int a = 5; // 00000101 = 2^0*1 + 2^2*1 = 1 + 4
        int b = 3; // 00000011 = 2^0*1 + 2^1*1 = 1 + 2
        System.out.println(a&b); // a and b 이므로 00000001 = 2^0*1 = 1
        System.out.println(a|b); // a or b 이므로 00000111 = 2^0*1 + 2^1*1 + 2^2*1 = 1 + 2 + 4 = 7
        System.out.println(a^b); // xor. a와 b가 서로 다름. -> 00000110 = 2 + 4 = 6
        System.out.println(~a); // not a 이므로 11111010.
    }
}
