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

class DogTest {

    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.setName("Spot");
        dog1.setBark("Ruff");

        Dog dog2 = new Dog();
        dog2.setName("Scruffy");
        dog2.setBark("Wurf");

        Dog dog3 = dog1;

        System.out.println("Dog1 is: " + dog1.showName());
        System.out.println("Dog1 says: " + dog1.showBark());

        System.out.println("Dog2 is: " + dog2.showName());
        System.out.println("Dog2 says: " + dog2.showBark());

        if (dog1 == dog3) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
        System.out.println(dog1.equals(dog3));
    }
}
