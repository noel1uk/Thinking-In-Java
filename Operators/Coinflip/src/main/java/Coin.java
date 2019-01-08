import java.util.Random;

public class Coin {

    int rand;

    public String flip() {
        setRand();
        System.out.println(rand);
        return this.rand > 50 ? "Tails" : "Heads";
    }

    private void setRand() {

        Random temp = new Random();
        this.rand = temp.nextInt(100) + 1;
    }
}
