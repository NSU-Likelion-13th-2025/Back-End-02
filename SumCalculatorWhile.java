import java.util.Scanner;

public class SumCalculatorWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Scanner 객체 생성. 화면으로부터 값을 입력받음

        // 초기식
        System.out.print("숫자를 입력하세요: "); // ln이 없으므로 행바꿈 x
        int n = sc.nextInt(); // 입력받은 숫자를 n에 저장
        int sum = 0, i = 1; // 변수 선언 및 초기화

        while (i <= n) { // 조건식. i이 n이하일 때
            sum += i; // sum = sum + i
            i++; // i는 1씩 증가
        }

        System.out.println("1부터" + n + "까지의 합: " + sum);
        sc.close(); // Scanner 사용 이후 sc.close()로 닫기.
    }
}
