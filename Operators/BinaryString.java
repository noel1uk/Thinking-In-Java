import java.util.*;

public class BinaryString {

    public static void main(String[] args) {
        Random rand = new Random(47);

        long l = rand.nextLong();
        long m = rand.nextLong();

        int i1 = 0x7be;
        printBinaryLong("-1L", -1L);
        printBinaryLong("+1L", +1L);
        long ll = 9223372036854775807L;
        printBinaryLong("maxpos", ll);
        long lln = -9223372036854775808L;
        printBinaryLong("maxneg", lln);
        printBinaryLong("l", l);
        printBinaryLong("~l", ~l);
        printBinaryLong("-l", -l);
        printBinaryLong("m", m);
        printBinaryLong("l & m", l & m);
        printBinaryLong("l | m", l | m);
        printBinaryLong("l ^ m", l ^ m);
        printBinaryLong("l << 5", l << 5);
        printBinaryLong("l >> 5", l >> 5);
        printBinaryLong("(~l) >> 5", (~l) >> 5);
        printBinaryLong("l >>> 5", l >>> 5);
        printBinaryLong("(~l) >>> 5", (~l) >>> 5);
    }

    static void printBinaryLong(String s, long l) {
        System.out.println(s + ", long: " + ", binary:\n " +
                Long.toBinaryString(l));
    }
}