public class VarArgsMain {

    public static void main(String ... args) {
        for(String item : args) {
            System.out.println(item);
        }
    }
}