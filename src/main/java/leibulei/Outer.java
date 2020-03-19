package leibulei;

public class Outer {
    private int num=100;

    private void method() {
        System.out.println("outer method");

    }
    class Inner{
        private int num=200;

        private void method() {
            int num=300;
            System.out.println("Inner method");
            System.out.println(num);
            System.out.println(this.num);
            System.out.println(Outer.this.num);
        }

        public void method2() {
            method();
        }
    }
}
