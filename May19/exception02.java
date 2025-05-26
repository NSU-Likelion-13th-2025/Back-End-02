//class C {}
//class D extends C {}
//
//public class exception02 {
//    public static void main(String[] args) {
//        // UncheckedException = RuntimeException(실행 예외)
//
//        // 1. ArithmeticException
//        System.out.println(3 / 0);
//
//        // 2. ClassCastException
//        C c = new C();
//        D d = (D)c;
//
//        // 3. ArrayIndexOutOfBoundsException
//        int[] array = {1, 2, 3};
//        System.out.println(array[5]);
//
//        // 4. NumberFormatException
//        int num = Integer.parseInt("10!!!");
//
//        // 5. NullPointerException
//        String str = null;
//        System.out.println(str.charAt(2));
