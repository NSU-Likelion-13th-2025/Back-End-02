import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Scanner 객체 생성. 화면으로부터 숫자를 입력받음.

        System.out.print("요일에 해당하는 숫자 (1~7)를 입력하세요: ");
        int day = sc.nextInt(); // 입력받은 숫자를 day에 저장

        switch (day) { // (조건식)
            case 1: // 조건식의 결과가 1일때
                System.out.println("일요일"); // "일요일"이 출력
                break; // 전체 switch문을 빠져나간다
            case 2: // 조건식의 결과가 2일때
                System.out.println("월요일"); // "월요일"이 출력
                break;
            case 3: // 조건식의 결과가 3일때
                System.out.println("화요일"); // "화요일"이 출력
                break;
            case 4: // 조건식의 결과가 4일때
                System.out.println("수요일"); // "수요일"이 출력
                break;
            case 5: // 조건식의 결과가 5일때
                System.out.println("목요일"); // "목요일"이 출력
                break;
            case 6: // 조건식의 결과가 6일때
                System.out.println("금요일"); // "금요일"이 출력
            case 7: // 조건식의 결과가 7일때
                System.out.println("토요일"); // "토요일"이 출력
                break;
            default: // 조건식 결과와 일치하는 case문이 없을 때 수행
                System.out.println("잘못된 입력입니다. 1~7 사이의 숫자를 입력하세요."); //""안의 문장이 출력
        }

        System.out.println("프로그램 종료.");
        sc.close(); // Scanner 사용 이후 sc.close()로 닫기
    }
}
