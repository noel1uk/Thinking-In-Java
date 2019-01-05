public class Fibonacci {

    int previousNumber = 1;
    int previousPreviousNumber = 1;
    int currentNumber;

    public void printNumbersUpto(int number) {
        for (int i = 0; i < number; i++) {
            if (i < 2) {
                System.out.println(previousNumber);
                System.out.println(previousPreviousNumber);
                i++;
            } else {
                currentNumber = previousNumber + previousPreviousNumber;
                System.out.println(currentNumber);
                previousPreviousNumber = previousNumber;
                previousNumber = currentNumber;
            }
        }
    }

    public static void main(String[] args) {
        Fibonacci fibi = new Fibonacci();
        fibi.printNumbersUpto(8);
    }

}
