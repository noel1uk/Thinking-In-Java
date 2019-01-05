public class OverLoadedConstructor {

    OverLoadedConstructor() {
        System.out.println("Hey from inside the no-args or default constructor");
    }

    OverLoadedConstructor(String s) {
        System.out.println(s);
    }

    public static void main(String[] args) {
        OverLoadedConstructor overLoadedConstructor1 = new OverLoadedConstructor();
        OverLoadedConstructor overLoadedConstructor2 = new OverLoadedConstructor(
                "I'm in the overloaded constructor");
    }
}