import java.util.Scanner;

public class GradeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Scanner 클래스의 객체 생성. 화면으로부터 숫자를 입력받음.

        System.out.println("시험 점수를 입력하세요: ");
        int score = sc.nextInt(); // 입력받은 숫자를 score에 저장.

        if (score >= 90) { // score가 90이상이면
            System.out.println("학점: A"); // "학점: A" 출력.
        } else if (score >= 80) { // score가 80이상-90미만 이면
            System.out.println("학점: B"); // "학점: B" 출력.
        }else if (score >= 70) { // score가 70이상-80미만 이면
            System.out.println("학점: C"); // "학점: C" 출력.
        } else if (score >= 60) { // score가 60이상 70미만 이면
            System.out.println("학점: D"); // "학점: D" 출력.
        } else {
            System.out.println("학점 : F (불합격)"); // 위의 조건에 모두 만족하지 못하면 "학점 : F (불합격)" 출력.
        }

        System.out.println("프로그램 종료.");
        sc.close(); // Scanner 사용 이후 sc.close()로 닫기.
    }
}