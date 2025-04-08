import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("요일에 해당하는 숫자 (1~7)를 입력하세요: ");
        int day = sc.nextInt(); // 사용자 입력

        switch (day) {
            case 1:
                System.out.println("일요일");
                break;
            case 2:
                System.out.println("월요일");
                break;
            case 3:
                System.out.println("화요일");
                break;
            case 4:
                System.out.println("수요일");
                break;
            case 5:
                System.out.println("목요일");
                break;
            case 6:
                System.out.println("금요일");
                break;
            case 7:
                System.out.println("토요일");
                break;
            default:
                System.out.println("잘못된 입력입니다. 1~7 사이의 숫자를 입력하세요.");
        }

        System.out.println("프로그램 종료.");
        sc.close();
    }
}
