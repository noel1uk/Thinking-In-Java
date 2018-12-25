public class ClassWithMethod {

    public static void main(String[] args) {
        ClassWithMethod c = new ClassWithMethod();
        System.out.println(c.storage("text"));
    }

    public int storage(String s) {
        return s.length() * 2;
    }
}