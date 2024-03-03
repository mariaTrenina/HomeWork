public class Drum implements Instrument {
    private String drumSize;

    public Drum(String drumSize) {
        this.drumSize = drumSize;
    }

    public String getDrumSize() {
        return drumSize;
    }

    public void setDrumSize(String drumSize) {
        this.drumSize = drumSize;
    }

    @Override
    public void play() {
        System.out.println("Plays drum with the size "+drumSize);
    }
}
