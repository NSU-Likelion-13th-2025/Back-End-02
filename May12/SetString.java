package May12;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetString {
    public static void main(String[] args) {
        /* 입력 */
        // 중복 데이터 입력
        Set<String> hashset1 = new HashSet<String>();
        hashset1.add("A");
        hashset1.add("B");
        hashset1.add("B");
        System.out.println("중복된 데이터: " + hashset1);

        // 다른 데이터 입력
        Set<String> hashset2 = new HashSet<>();
        hashset2.add("가");
        hashset2.add("나");
        hashset2.add("다");
        System.out.println("서로 다른 데이터: " + hashset2);

        /* 추출 */
        Set<String> hashset3 = new HashSet<>();
        System.out.println("hashset3 비었나?" + hashset3.isEmpty());
        System.out.println("hashset3 최초 데이터 크기 : " + hashset3.size());

        hashset3.add("가");
        hashset3.add("나");
        hashset3.add("다");
        System.out.println("hashset3 B있나? " + hashset3.contains("B"));
        System.out.println("hashset3 D있냐? " + hashset3.contains("D"));

        System.out.println("hashset3 크기 : " + hashset3.size());

        // Iterator 인터페이스
        System.out.println("Iterator 이너페이스 사용");
        Iterator<String> iterator = hashset3.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println();

        // for-each 구문
        System.out.println("for-each 구문 사용");
        for (String s : hashset3) {
            System.out.println(s);
        }

        /* 배열로 변환 */
        Object[] objArray = hashset3.toArray();
        System.out.println("방법 1: " + Arrays.toString(objArray));

        String[] strArray = hashset3.toArray(new String[0]);
        System.out.println("방법 2: " + Arrays.toString(strArray));
    }
}
