package May7;

    public class LocalInnnerDuplicateTest {
        void methodOne() {
            class Local {
                void show() {
                    System.out.println("Inside methodOne - Local");
                }
            }
            Local local = new Local();
            local.show();
        }

        void methodTwo(){
            class Local {
                void show() {
                    System.out.println("Inside methodTwo - Local");
                }
            }
            Local local = new Local();
            local.show();
        }

        public static void main(String[] args) {
            LocalInnnerDuplicateTest test = new LocalInnnerDuplicateTest();
            test.methodOne();
            test.methodTwo();
        }
}