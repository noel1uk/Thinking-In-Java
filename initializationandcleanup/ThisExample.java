public class ThisExample {

    public void method1() {
        method2();
        this.method2();
    }

    public void method2() {
        System.out.println("it works");
    }

    public static void main(String[] args) {
        ThisExample thisExample = new ThisExample();
        thisExample.method1();
    }
}