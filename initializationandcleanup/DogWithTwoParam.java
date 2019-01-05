public class DogWithTwoParam {

    public void bark(int i, char c) {
        System.out.println("woof");
    }

    public void bark(char c, int i) {
        System.out.println("meow");
    }

    public static void main(String[] args) {
        DogWithTwoParam dog = new DogWithTwoParam();
        dog.bark(4, 'c');
        dog.bark('c', 4);
    }
}