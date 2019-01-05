public class WithConstructor {
    String st1;
    String st2 = "second";

    WithConstructor() {
        st1 = "first";
    }

    public static void main(String[] args) {
        WithConstructor withConstructor = new WithConstructor();
        System.out.println(withConstructor.st1);
        System.out.println(withConstructor.st2);
    }
}