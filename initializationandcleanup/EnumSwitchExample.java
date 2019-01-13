public class EnumSwitchExample {

    Notes note;

    EnumSwitchExample(Notes note) {
        this.note = note;
    }

    public void describe() {
        System.out.println("The denomination is worth ");
        switch (note) {
            case FIVE:
                System.out.println("five pounds");
                break;
            case TEN:
                System.out.println("ten pounds");
                break;
            case TWENTY:
                System.out.println("twenty pounds");
                break;
            case FIFTY:
                System.out.println("fifty pounds");
                break;
            case HUNDRED:
                System.out.println("one hundred pounds");
                default:
                    System.out.println("Enter an denomination");
        }
    }

    public static void main(String[] args) {
        EnumSwitchExample five = new EnumSwitchExample(Notes.FIVE),
                ten = new EnumSwitchExample(Notes.TEN),
                twenty = new EnumSwitchExample(Notes.TWENTY),
                fifty = new EnumSwitchExample(Notes.FIFTY),
                hundred = new EnumSwitchExample(Notes.HUNDRED);

        five.describe();
        ten.describe();
        twenty.describe();
        fifty.describe();
        hundred.describe();
    }

    private enum Notes {
        FIVE, TEN, TWENTY, FIFTY, HUNDRED;
    }
}

