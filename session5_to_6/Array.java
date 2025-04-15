package session5_to_6;

public class Array {
    public static void main(String[] args) {

        // 방법 1. 객체 생성 후 값 대입
        int[] array1 = new int[3];
        // 배열 선언 및 생성. [괄호 안] : 배열의 길이
        array1[0] = 10; // 배열 array1의 1번째 요소 -> 10 저장
        array1[1] = 20; // 참조 변수명[1] = 값;
        array1[2] = 30;
        System.out.println(array1[0] + " " + array1[1] + " " + array1[2]);

        // 방법 2. 객체 생성과 함께 값 대입
        int[] array2 = new int[]{1, 2, 3}; // 배열 선언 및 생성. 중괄호 안은 각 항목
        // 자료형[] 참조 변수명 = new 자료형[]{값1, 값2...};
        System.out.println(array2[0] + " " + array2[1] + " " + array2[2]);

        // 방법 3. 대입할 값만 입력하기
        int[] array3 = {4, 5, 6}; // 배열 선언 및 생성
        // 자료형[] 참조 변수명 = {값1, 값2...};
        System.out.println(array3[0] + " " + array3[1] + " " + array3[2]);
    }
}
