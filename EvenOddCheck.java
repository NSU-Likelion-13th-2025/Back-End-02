import java.util.Scanner;

public class EvenOddCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Scanner 클래스의 객체 생성. 화면으로부터 입력 받음.

        System.out.print("숫자를 입력하세요: ");
        int number = sc.nextInt(); // 입력하는 숫자가 number에 저장.

        if (number % 2 == 0) { // (조건식)을 만족하면 "입력한 숫자는 짝수입니다."가 출력
            System.out.println("입력한 숫자는 짝수입니다.");
        } else { // (조건식)을 만족하지 않으면 "입력한 숫자는 홀수입니다."가 출력
            System.out.println("입력한 숫자는 홀수입니다.");
        }

        System.out.println("프로그램 종료.");
        sc.close(); // Scanner 사용 이후 sc.close()로 닫기.
    }
}
