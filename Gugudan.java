public class Gugudan {
    public static void main(String[] args) {
        for (int dan = 2; dan <= 9; dan++) { // 변수 선언및 초기화. 초기식 dan에 2할당. dan이 9이하일때 반복. dan은 실행이후 1씩 증가.
            System.out.println("=== " + dan + "단 ===");
            for (int i = 1; i <= 9; i++) { // 위와 동일. i에 1할당. i는 9이하일때 반복. i는 실행이후 1씩 증가.
                System.out.println(dan + " x " + i + " = " + (dan * i));
            }
            System.out.println(); // 단마다 줄바꿈
        }
    }
}
