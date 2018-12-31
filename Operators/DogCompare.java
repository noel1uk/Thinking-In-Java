class Dog {
    private String name;
    private String says;

    public void setName(String name) {
        this.name = name;
    }

    public void setBark(String bark) {
        this.says = bark;
    }

    public String showName() {
        return this.name;
    }

    public String showBark() {
        return this.says;
    }

}

public class DogCompare {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.setName("Spot");
        dog1.setBark("Ruff");
        Dog dog2 = new Dog();
        dog2.setName("Scruffy");
        dog2.setBark("Wurf");
        System.out.println("Dog1 is: " + dog1.showName());
        System.out.println("Dog1 says: " + dog1.showBark());
        System.out.println("Dog2 is: " + dog2.showName());
        System.out.println("Dog2 says: " + dog2.showBark());
        Dog dog3 = new Dog();
        dog3.setName("Butch");
        dog3.setBark("Hello!");
        dog3.showName();
        dog3.showBark();
        System.out.println("Comparison: ");
        System.out.println("spot == dog3: " + (dog1 == dog3));
        System.out.println("spot.equals(dog3): " + dog1.equals(dog3));
        System.out.println("butch.equals(spot): " + dog3.equals(dog1));
        System.out.println("Now assign: spot = dog3");
        dog1 = dog3;
        System.out.println("Compare again: ");
        System.out.println("dog1 == dog3: " + (dog1 == dog3));
        System.out.println("dog1.equals(dog3): " + dog1.equals(dog3));
        System.out.println("dog3.equals(dog1): " + dog3.equals(dog1));
        System.out.println("dog1: ");
        System.out.println(dog1.showName());
        System.out.println(dog1.showBark());
        System.out.println("dog3: ");
        System.out.println(dog3.showName());
        System.out.println(dog3.showBark());
    }
}