package session4;

public class Homework2 {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            if (i == 7) {
                System.out.println("7단은 넘어갈게요");
              continue;
            }
//            if (i == 8) {
//                break;
//            }
            System.out.println("===" + i + "단===");
                for (int j = 1; j < 10; j++) {
                    System.out.println(i + " x " + j + " = " + i * j);
                }
        }
    }
}
