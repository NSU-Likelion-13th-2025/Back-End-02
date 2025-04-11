import java.util.Scanner;

public class AgeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Scanner클래스의 객체를 생성? 화면에서 입력받음.

        System.out.print("나이를 입력하세요: ");
        int age = sc.nextInt(); // 입력받은 내용 -> age 저장

        if (age >= 20) { // (조건식)인 age가 20이상이면 "당신은 성인입니다"가 출력하고, 아니면 실행구문이 실행되지 않음.
            System.out.println("당신은 성인입니다.");
        }

        System.out.println("프로그램 종료.");
        sc.close(); // Scanner 사용 이후 sc.close()로 닫기.
    }
}
