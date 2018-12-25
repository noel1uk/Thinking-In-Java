class AllTheColoursOfTheRainbow {

    int anIntegerRepresentingColours = 0;
    int hue = 0;
    void changeTheHueOfTheColour(int newHue) {
        this.hue = newHue;
    }

    public static void main(String[] args) {
        AllTheColoursOfTheRainbow allTheColoursOfTheRainbow = new AllTheColoursOfTheRainbow();
        allTheColoursOfTheRainbow.changeTheHueOfTheColour(1);
        System.out.println(allTheColoursOfTheRainbow.hue);
    }
}