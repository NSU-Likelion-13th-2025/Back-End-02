import java.util.Scanner;

public class SumCalculatorWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("숫자를 입력하세요: ");
        int n = sc.nextInt();
        int sum = 0, i = 1;

        while (i <= n) {
            sum += i; // sum = sum + i
            i++;
        }

        System.out.println("1부터" + n + "까지의 합: " + sum);
        sc.close();
    }
}
