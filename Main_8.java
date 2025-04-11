public class Main_8 {
    public static void main(String[] args) {

        int b = 8; // 00001000
        b &= 3; System.out.println("b &= 3 : " + b); // 3 : 00000011 이고 b &= 3 : 00000000
        b |= 2; System.out.println("b |= 2 : " + b); // 2 : 00000010 이고 b |= 2 : 00000010
        b ^= 6; System.out.println("b ^= 6 : " + b); // 6 : 00000110 이고 b ^= 6 : 00000100
        b <<= 1; System.out.println("b <<= 1 : " + b); // 00001000 왼쪽으로 1칸 밈.
        b >>= 2; System.out.println("b >>= 2 : " + b); // 00000010 오른쪽으로 2칸 밈.
        b >>>= 2; System.out.println("b >>>= 2 : " + b); // >>> : 논리 쉬프트. 다 0
    }
}
