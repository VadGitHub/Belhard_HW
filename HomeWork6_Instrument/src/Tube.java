public class Tube implements Instrument {

    private int diameter;

    public Tube() {}

    public Tube(int diameter) {
        this.diameter = diameter;
    }

    public int getDiameter() {
        return diameter;
    }

    @Override
    public void play() {
        System.out.println("Играет труба с диаметром " + getDiameter() + "см");
    }
}
