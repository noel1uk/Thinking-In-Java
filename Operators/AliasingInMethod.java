class AliasingInMethod {

    public static void main(String[] args) {
        ExampleFloat e = new ExampleFloat();
        System.out.println(e.f);
        f(e);
        System.out.println(e.f);
    }

    static void f(ExampleFloat x) {
        x.f = 1.1f;
    }
}



class ExampleFloat {
    float f;
}