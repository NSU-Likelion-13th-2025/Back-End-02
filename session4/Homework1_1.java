package session4;

public class Homework1_1 {
    public static void main(String[] args) {
        // 피드백. 중괄호 하나당 하나의 기능을 사용하는 게 나중에 수정도 쉬워서 묶는 걸 권장하진 않지만, 묶은 코드는 아래와 같다
        // 배열 생성 - 방법3
        int[] score = new int[]{85, 92, 78, 65, 55, 90, 73, 88, 47, 100};
        int min = score[0];
        int max = score[0];

        for (int i = 0; i < score.length; i++) {
            if (score[i] <= 0 || score[i] > 100) {
                continue;
            }
            if (score[i] < min) { //최소값
                min = score[i];
            }
            if (score[i] > max) { //최대값
                max = score[i];
            }
            \\

        }
    }
}