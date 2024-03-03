public class Tuba implements Instrument {
    private double diameter;

    public Tuba(double diameter) {
        this.diameter = diameter;
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    @Override
    public void play() {
        System.out.println("Plays the tuba with the diameter "+diameter);
    }
}
