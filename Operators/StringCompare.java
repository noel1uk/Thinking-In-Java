public class StringCompare {
    public static void main(String[] args) {
        StringCompare stringCompare = new StringCompare();
        stringCompare.StringComparison("mu", "fu");
    }

    public void StringComparison(String st1, String st2) {
//        System.out.println(st1 > st2);
//        System.out.println(st1 >= st2);
//        System.out.println(st1 < st2);
//        System.out.println(st1 <= st2);
        System.out.println(st1 == st2);
        System.out.println(st1 != st2);
        System.out.println(st1.equals(st2));
        System.out.println(!st1.equals(st2));
    }
}