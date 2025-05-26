package May12;

import java.util.ArrayList;
import java.util.List;

public class ListMain {
    public static void main(String[] args) {
        String[] array = new String[5];
        array[0] = "A";
        array[1] = "B";
        array[2] = "C";
        array[3] = "D";
        array[4] = "E";
        System.out.println("Array 전: " + array.length);

        array[3] = null;
        array[4] = null;
        System.out.println("Array 중:" + array.length);

        List<String> list = new ArrayList<String>();
        list.add("가");
        list.add("나");
        list.add("다");
        list.add("라");
        list.add("마");
        System.out.println("List 전: " + list.size());

        list.remove("다");
        list.remove("라");
        System.out.println("List 후: " + list.size());
    }
}
