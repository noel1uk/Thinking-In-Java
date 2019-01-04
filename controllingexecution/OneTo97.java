public class OneTo97 {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 100) {
            System.out.println(i);
            if(i == 97) {
//                break
                return;
            }
            i++;
        }
    }
}