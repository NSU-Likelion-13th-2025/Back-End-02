package homework;

import java.util.Scanner;
//import java.util.*;     package 안에 있는 모든 클래스 가져오기(*)

public class StudentTest {
    public static void main(String[] args) {
        while () { // ** 조건식 추가
            // 안내문 출력
            System.out.println("--------------------------------------");
            System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
            System.out.println("--------------------------------------");

            // 값을 입력받아 변수에 저장
            Scanner sc = new Scanner(System.in);   //입출력과 관련된 클래스
            // ** 값을 어디서 받을지 위치 다시 조정하기
            int student = sc.nextInt();            //학생수
            int num = sc.nextInt();                //배열의 크기
            int[] scores = new int[num];           //scores = 배열의 변수명, num = 배열의 크기

            int choice = sc.nextInt();

            System.out.println("선택> " + choice);

            // ** 반복문 1개만
//            while (1 < choice < 5) {
//                int i = 0;
//                scores[i] = sc.nextInt();
//                if (choice == 3) {
//                    System.out.println("scores[i]>" + scores[i]);
//                    i++;
//                }

            // choice 값을 선택해서 기능을 수행
            switch (choice) {
                /* 학생수 */
                case 1:
                    System.out.println("학생수> " + student);
                    break;

                /* 점수 입력 */
                case 2:
                    // ** 기능 추가

                /* 점수리스트 */
                case 3:
                    // ** 기능 추가
                    // 반복문 사용

                /* 분석 */
                case 4:
                    System.out.println("선택> " + choice); //최고점수
                    int max = scores[0];
                    // 반복문 for
                    for (true) {
                        int i = 0;
                        if (scores[i] > max) {
                            max = scores[i];
                        }
                        i++;
                    }

                    int sum = 0;
                    while (true) {
                        int sum +=scores[i];
                        i++;
                    }

                    double avg = (double) sum / num;
                    System.out.println("최고 점수: " + max);
                    System.out.println("평균 점수: " + avg);
                    break;

                /* 종료 */
                case 5:
                    System.out.println("프로그램 종료");
                    break;
            }
        }
//        }

    }

}