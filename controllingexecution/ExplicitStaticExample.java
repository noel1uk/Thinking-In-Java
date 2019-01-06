public class ExplicitStaticExample {

    static String str1 = "string1";
    static String str2;

    static {
        str2 = "string2";
    }

    public static void method1() {
        System.out.println(str1);
        System.out.println(str2);
    }

    public static void main(String[] args) {
        ExplicitStaticExample.method1();
    }
}