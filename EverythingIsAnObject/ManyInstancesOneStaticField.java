class ManyInstancesOneStaticField {

    static int testField = 1;

    public static void main(String[] args) {
        ManyInstancesOneStaticField m1 = new ManyInstancesOneStaticField();
        ManyInstancesOneStaticField m2 = new ManyInstancesOneStaticField();
        ManyInstancesOneStaticField m3 = new ManyInstancesOneStaticField();
        System.out.println("The untampered testField value for m1 is: " + m1.testField);
        System.out.println("The untampered testField value for m2 is: " + m2.testField);
        System.out.println("The untampered testField value for m3 is: " + m3.testField);
        m1.testField = 100;
        System.out.println("The altered testField value for m1 is: " + m1.testField);
        System.out.println("The altered testField value for m2 is: " + m2.testField);

    }
}