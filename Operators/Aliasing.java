class Aliasing {
    float changeThis = 3.1f;

    public static void main(String[] args) {
        Aliasing a = new Aliasing();
        Aliasing b = new Aliasing();
        a.changeThis = 3.7f;
        System.out.println(a.changeThis);
        System.out.println(b.changeThis);
        a = b;
        System.out.println(a.changeThis);
        System.out.println(b.changeThis);
        a.changeThis = 41.1f;
        System.out.println(a.changeThis);
        System.out.println(b.changeThis);
    }
}