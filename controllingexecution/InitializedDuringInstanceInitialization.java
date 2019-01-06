public class InitializedDuringInstanceInitialization {

    private String str;

    InitializedDuringInstanceInitialization() {
        {
            str = "its initialized";
        }
    }

    public String getStr() {
        return str;
    }

    public static void main(String[] args) {
        System.out.println(new InitializedDuringInstanceInitialization().getStr());
    }
}