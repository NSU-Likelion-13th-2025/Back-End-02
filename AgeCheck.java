import java.util.Scanner;

public class AgeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("나이를 입력하세요: ");
        int age = sc.nextInt(); // 사용자 입력

        if (age >= 20) {
            System.out.println("당신은 성인입니다.");
        }

        System.out.println("프로그램 종료.");
        sc.close();
    }
}
