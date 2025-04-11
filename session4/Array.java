package session4;

public class Array {
    public static void main(String[] args) {

        // 방법 1
        int [] array1 = new int [3];
        array1[0] = 10;
        array1[1] = 20;
        array1[2] = 30;
        System.out.println(array1[0] + " " + array1[1] + " " + array1[2]);

        // 방법 2
        int [] array2 = new int[]{1, 2, 3};
        System.out.println(array2[0] + " " + array2[1] + " " + array2[2]);

        // 방법 3
        int [] array3 = {4, 5, 6};
        System.out.println(array3[0] + " " + array3[1] + " " + array3[2]);
    }
}
