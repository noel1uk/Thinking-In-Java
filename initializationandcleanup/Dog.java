public class Dog {

    public void bark() {
        System.out.println("bark");
    }
    public void bark(int i) {
        System.out.println("wooo");
    }
    public void bark(char c) {
        System.out.println("meow");
    }

    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.bark();
        dog1.bark(1);
        dog1.bark((char)'c');
    }
}