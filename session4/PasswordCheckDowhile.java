package session4;

import java.util.Scanner;

public class PasswordCheckDowhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Scanner 객체 생성. 화면으로부터 값을 입력받음.
        int password; // 변수 선언

        do { //조건식의 결과와 상관xx 최소한 한번은 수행
            System.out.print("비밀번호를 입력하세요 :");
            password = sc.nextInt(); // 초기화. 입력받은 값을 password에 저장.

            if (password != 1234) { // 입력받은 숫자가 1234가 아니면
                System.out.println("비밀번호가 틀렸습니다. 다시 시도하세요."); // ""안의 문장을 출력한다.
            }
        } while (password != 1234);

        System.out.println("비밀번호가 올바릅니다. 접근 승인!"); // 1234를 입력하면 ""안의 문장을 출력.
        sc.close(); // Scanner 수행 이후 sc.close()로 닫음.
    }
}
