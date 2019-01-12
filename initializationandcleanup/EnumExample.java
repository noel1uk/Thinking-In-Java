public class EnumExample {

    public enum Notes {
        FIVE, TEN, TWENTY, FIFTY, HUNDRED
    }
    public static void main(String[] args) {
        for(Notes note : Notes.values()) {
            System.out.println(note);
        }
    }
}

