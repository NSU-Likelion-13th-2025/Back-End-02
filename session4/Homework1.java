package session4;

public class Homework1 {
    public static void main(String[] args) {

        // 배열 선언 및 생성 방법

        // 방법 1. 배열 생성과 동시에 항목 값을 저장
        // int[] score = {85, 92, 78, ... , 100};
        // 자료형[] 변수 = {값0, 값1, 값2, ... , 값 9};

        // 방법 2. 배열 생성 후 나중에 항몫 값을 저장
        // int[] score = new int[10];
        // 자료형[] 변수 = new 자료형[항목수];  // 배열 선언 및 생성.
        // score[0] = 85;
        // score[1] = 92;
        // 와 같이 이후에 항몫값을 후에 배열에 넣음

        int[] score = {85, 92, 78, 65, 55, 90, 73, 88, 47, 100};

        for (int i = 0; i < score.length; i++) { //성적에 따라 문자열 형태의 등급을 분류

            if(score[i] >= 90) {
                System.out.println("학생 " + (i+1) + ": 성적 = " + score[i] + ", 평가 = A, 합격");
            }

            else if(score[i] >= 80) {
                System.out.println("학생 " + (i+1) + ": 성적 = " + score[i] + ", 평가 = B, 합격");
            }

            else if(score[i] >= 70) {
                System.out.println("학생 " + (i+1) + ": 성적 = " + score[i] + ", 평가 = C, 합격");
            }

            else if(score[i] >= 60) {
                System.out.println("학생 " + (i+1) + ": 성적 = " + score[i] + ", 평가 = D, 합격");
            }

            else {
                System.out.println("학생 " + (i+1) + ": 성적 = " + score[i] + ", 평가 = F, 불합격");
            }

        }

        int max = score[0];
        int min = score[0];

        for (int i = 0; i < score.length; i++) { // 최저 점수를 구하는 반복문

            if (score[i] < 0 || score[i] > 100) {
            continue;
            }
            if (score[i] < min) {
                min = score[i];
            }

        }



        for (int i = 0; i < score.length; i++) { // 최고 점수를 구하는 반복문
            if (score[i] < 0 || score[i] > 100) {
                continue;
            }
            if (score[i] == 100) {
                System.out.println("최고점수 100점 발견! 더 이상 최고 점수를 찾지 않습니다.");
                break;
            }

            if (score[i] > max) {
                max = score[i];
            }
        }

        int sum = 0; // 평균을 구하기 위한 모든 항목값의 총합
        for (int i = 0; i < score.length; i++) {
            sum += score[i];
        }
        double avg = (double)sum / score.length;
        //평균값을 구하기 위해 모든 항목값의 총합을 항목수로 나눔.
        //나눗셈을 사용하므로 avg의 자료형은 double을 사용하고, 자료형이 int인 변수sum을 double로 강제 형변환함.

        System.out.println("전체 성적 평균: " + avg);
        System.out.println("최고 점수: " + max);
        System.out.println("최저 점수: " + min);

    }

}