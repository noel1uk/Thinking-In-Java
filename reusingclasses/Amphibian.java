class Amphibian {
    protected void swim() {
        System.out.println("Amphibian swim");
    }

    static void grow(Amphibian a) {
        System.out.println("Amphibian grow");
        a.swim();
    }
}

class Frog extends Amphibian {
    public static void main(String[] args) {
        Frog frog = new Frog();
        // call base class methods
        frog.swim();
        // upcast Frog to Amphibian argument:
        Amphibian.grow(frog);
    }
}