public class Exponential {
    public static void main(String[] args) {
        // Uppercase and lowercase 'e' are the same:
        float expFloat = 1.39e-43f;
        expFloat = 1.39E-43f;
        System.out.println(expFloat);
        double expDouble = 47e47d; // d is optional
        double expDouble2 = 47e47; // automatic double
        System.out.println(expDouble);
        System.out.println(expDouble2);
    }

}