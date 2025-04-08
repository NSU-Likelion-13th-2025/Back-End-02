import java.util.Scanner;

public class PasswordCheckDowhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int password;

        do {
            System.out.print("비밀번호를 입력하세요 :");
            password = sc.nextInt();

            if (password != 1234) {
                System.out.println("비밀번호가 틀렸습니다. 다시 시도하세요.");
            }
        } while (password != 1234);

        System.out.println("비밀번호가 올바릅니다. 접근 승인!");
        sc.close();
    }
}
