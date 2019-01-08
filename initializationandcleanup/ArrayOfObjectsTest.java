public class ArrayOfObjectsTest {

    ArrayOfObjectsTest(String str1) {
        System.out.println("hello");
        System.out.println(str1);
    }

    public static void main(String[] args) {
        ArrayOfObjectsTest[] theArray = new ArrayOfObjectsTest[10];
        for (int i = 0; i < theArray.length; i++) {
            theArray[i] = new ArrayOfObjectsTest(Integer.toString(i));
        }
    }
}