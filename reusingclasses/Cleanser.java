class Cleanser {
    private String s = "Cleanser";

    Cleanser() {
    }

    public void append(String var1) {
        this.s = this.s + var1;
    }

    public void dilute() {
        this.append(" dilute()");
    }

    public void apply() {
        this.append(" apply()");
    }

    public void scrub() {
        this.append(" scrub()");
    }

    public String toString() {
        return this.s;
    }

    public static void main(String[] var0) {
        Cleanser var1 = new Cleanser();
        var1.dilute();
        var1.apply();
        var1.scrub();
        System.out.println(var1);
    }
}

class Detergent extends Cleanser {

    //change a method
    public void scrub() {
        append(" Detergent.scrub()");
        super.scrub(); // call to base class version
    }

    // add methods to the interface

    public void foam() {
        append(" foam()");
    }

    // test the new class:
    public static void main(String[] args) {
        Detergent x = new Detergent();
        x.dilute();
        x.apply();
        x.scrub();
        x.foam();
        System.out.println(x);
        System.out.println("Testing base class");
        Cleanser.main(args);
    }
}