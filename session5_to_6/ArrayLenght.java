package session5_to_6;

public class ArrayLenght {
    public static void main(String[] args) {
        int[] a = new int[10]; // a array 선언 및 생성
        a[0] = 1; // a array 첫번째 항목 -> 1
        a[1] = 2; // a array 두번째 항목 -> 2
        a[2] = 3;
        a[3] = 4;
        a[4] = 5;
        a[5] = 6;
        a[6] = 7;
        a[7] = 8;
        a[8] = 9;
        a[9] = 10;

        for (int i = 0; i < a.length; i++) { // 초기 i = 0. i < a array 항목수(10)가 만족할 때까지 i는 1씩 증가하며 반복해서
            System.out.println(a[i]); // a array의 항목을 하나씩 출력한다.
        }
    }
}
