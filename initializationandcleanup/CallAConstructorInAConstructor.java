public class CallAConstructorInAConstructor {

    CallAConstructorInAConstructor() {
        this(1);
        System.out.println("in the default constructor");
    }

    CallAConstructorInAConstructor(int n) {
        System.out.println("in the int taking constructor");
    }



    public static void main(String[] args) {
    CallAConstructorInAConstructor callAConstructorInAConstructor = new CallAConstructorInAConstructor();
    }
}