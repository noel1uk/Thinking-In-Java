public class UninitializedStringReference {
    String foo;

    public static void main(String[] args) {
        UninitializedStringReference uninitializedStringReference = new UninitializedStringReference();
        System.out.println(uninitializedStringReference.foo);
    }
}