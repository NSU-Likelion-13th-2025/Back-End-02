package session4;

public class Homework1 {
    public static void main(String[] args) {
        int[] score = new int[10]; // 배열 선언 및 생성. 10개의 int 값을 저장할 수 있는 배열 생성.

        score[0] = 85; // 배열 score의 1번째 요소에 85를 저장. index는 0부터 시작
        score[1] = 92;
        score[2] = 78;
        score[3] = 65;
        score[4] = 55;
        score[5] = 90;
        score[6] = 73;
        score[7] = 88;
        score[8] = 47;
        score[9] = 100;
        int max = score[0];
        int min = score[0];

        System.out.println("학생 성적 결과");
        for (int i = 0; i < 10; i++) {
            System.out.print("학생 " + (i+1) + ": " + "성적 = " + score[i] + ", " + "평가 = ");
            if (score[i] >= 90) {
                System.out.print("A" + ", 합격");
            } else if (score[i] >= 80) {
                System.out.print("B" + ", 합격");
            } else if (score[i] >= 70) {
                System.out.print("C" + ", 합격");
            } else if (score[i] >= 60) {
                System.out.print("D" + ", 합격");
            } else {
                System.out.print("F" + ", 불합격");
            }
            System.out.println();
        }

        for (int i = 0; i < 10; i++) {
            if (max < score[i]) {
                max = score[i];
            //if (max = 100){
               // break;
            }
        }

        for (int i = 0; i < 10; i++) {
            if (min > score[i]) {
                min = score[i];
            }
        }

        System.out.println("최고 점수 " + max + "점 발견! 더 이상 최고 점수를 찾지 않습니다.");

        double average;
        double sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += score[i];
        }
        average = sum / 10;
        System.out.println("전체 성적 평균: " + average);

        System.out.println("최고 점수: " + max);
        System.out.println("최소 점수: " + min);



    }

}