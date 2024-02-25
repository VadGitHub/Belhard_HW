public class Run {
    public static void main(String[] args) {

        Instrument[] instruments = new Instrument[3];

        instruments[0] = new Guitar(6);
        instruments[1] = new Drum("Большой");
        instruments[2] = new Tube(20);

        for (Instrument i : instruments) {
            i.play();
        }

    }
}
