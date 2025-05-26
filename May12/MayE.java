package May12;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MayE {
    public static void main(String[] args) {
        Map<Integer, String> map1 = new HashMap<Integer, String>();
        map1.put(1, "포도");
        map1.put(2, "사과");
        map1.put(3, "딸기");
        System.out.println(map1);

        /* 전체 한번에 추가 */
        Map<Integer, String> map2 = new TreeMap<Integer, String>();
        map2.putAll(map1);
        System.out.println(map2);

        /* 변경 */
        map2.replace(1, "귤");
        System.out.println(map2);

        /* 추출 */
        // key값으로 추출
        System.out.println(map2.get(2));
        // key 존재 유무
        System.out.println("key=3인 데이터 존재? : " + map2.containsKey(3));
        // value 존재 유무
        System.out.println("value=포도인 데이터 존재? : " + map2.containsValue("포도"));

        // 키값 추출
        Set<Integer> keySet = map2.keySet();
        System.out.println("전체 키값 : " + keySet);

        // 전체 데이터 추출
        Set<Map.Entry<Integer, String>> entrySet = map2.entrySet();
        System.out.println("전체 데이터 : " + entrySet);

        // 크기
        System.out.println("map2 크기 : " + map2.size());

        /* 삭제 */
        map1.remove(1);
        System.out.println("map1의 key=1 데이터 삭제 : " + map1);
        // 전체 삭제
        map2.clear();
        System.out.println("map2 데이터 전체 삭제 : " + map2);
    }
}
