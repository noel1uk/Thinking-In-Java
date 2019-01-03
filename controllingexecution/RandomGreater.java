import java.util.*;

public class RandomGreater {
    public static void main(String[] args) {
        int round = 0;
        while (true) {
            while (round <= 25) {
                Random rand = new Random();
                int number1 = rand.nextInt();
                int number2 = rand.nextInt();
                System.out.println("round " + round + ": ");
                if (number1 > number2) {
                    System.out.println(number1 + " is greater then " + number2);
                } else if (number1 == number2) {
                    System.out.println(number1 + " is equal to " + number2);
                } else {
                    System.out.println(number1 + " is less then " + number2);
                }
                round++;
            }
        }
    }
}