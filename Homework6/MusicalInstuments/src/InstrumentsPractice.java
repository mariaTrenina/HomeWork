public class InstrumentsPractice {
    public static void main(String[] args) {

        Instrument[] instruments = new Instrument[3];
        instruments[0] = new Guitar(6);
        instruments[1] = new Drum("1044 * 864");
        instruments[2] = new Tuba(3.70);

        for (Instrument i: instruments) {
            i.play();
        }
    }
}
