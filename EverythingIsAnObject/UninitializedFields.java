public class UninitializedFields {
        static int uninitializedInt;
        static char uninitializedChar;

    public static void main(String[] args) {
        System.out.println(uninitializedInt);
        System.out.println(uninitializedChar);
    }
}