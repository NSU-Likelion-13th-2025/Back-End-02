package session5_to_6;

import org.w3c.dom.ls.LSOutput;

public class String_01 {
    public static void main(String[] args) {
        String str1 = "안녕" + "하세요"; // 문자열 끼리는 각 문자열을 ""안에 넣어 + 로 연결
        System.out.println(str1);

        String str2 = "반갑";
        str2 += "습니다!"; // str2 = str2 + "습니다!"
        System.out.println(str2);
    }
}
