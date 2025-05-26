//import java.io.FileInputStream;
//import java.io.InputStreamReader;
//
//
//class A implements Cloneable {
//    protected Object clone() throws CloneNotSupportedException {
//        return super.clone();
//    }
//}
//
//
//public class exception01 {
//    public static void main(String[] args) {
//        // Checked Exception(일반 예외)
//
//        // 1. InterruptedException
//        Thread.sleep(1000);
//
//        // 2. ClassNotFoundException
//        Class cls = Class.forName("java.lang.Object");
//
//        // 3. IOException
//        InputStreamReader isr = new InputStreamReader(System.in);
//        isr.read();
//
//        // 4. FileNotFoundException
//        FileInputStream fis = new FileInputStream("text.txt");
//
//        // 5. CloneNotSupportedException
//        A a1 = new A();
//        A a2 = new (A)a1.clone();
//    }
//}