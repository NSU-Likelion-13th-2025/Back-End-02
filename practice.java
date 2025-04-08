import java.util.Scanner;

public class practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("시험 점수를 입력하세요: ");
        int score = sc.nextInt();

        if (score >= 90) {
            System.out.println("학점: A");
        } else if (score >= 80) {
            System.out.println("B");
        }else if (score >= 70) {
            System.out.println("C");
        } else if (score >= 60) {
            System.out.println("D");
        } else {
            System.out.println("학점 : F (불합격)");
        }

        System.out.println("프로그램 종료.");
        sc.close();
    }
}