public class VarArgs {

    static void printArray(String ... arr) {
        for (String item : arr) {
            System.out.println(item);
        }
    }

    public static void main(String[] args) {
        VarArgs.printArray("foo", "bar");
        VarArgs.printArray(new String[] {"foo2", "bar2", "foo3"});
    }
}