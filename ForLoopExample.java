import java.util.Scanner;

public class ForLoopExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("숫자를 입력하세요: ");
        int n = sc.nextInt();
        int sum = 0, i = 0;

        while (i <= n) {
            sum += i;
            i++;
        }

        System.out.println("1부터" + n + "까지의 합: " + sum);
        sc.close();
    }
}
